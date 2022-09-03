# 🔨部署文档

> 安装环境： centos-7.9
>
> 通过docker-compose的方式部署
>
> 💡安装过程中可以先将防火墙关闭，之后再开启可以方便验证

## 1️⃣ 安装docker & docker-compose

安装`yum-utils`

```bash
yum install -y yum-utils device-mapper-persistent-data lvm2
```

yum源添加docker

```bash
yum-config-manager --add-repo https://download.docker.com/linux/centos/docker-ce.repo
```

安装docker

```bash
yum install docker-ce
```

设置开机自启动，并启动docker

```bash
systemctl enable docker
systemctl start docker
```

下载docker-compose

```bash
curl -L https://get.daocloud.io/docker/compose/releases/download/1.24.0/docker-compose-`uname -s`-`uname -m` > /usr/local/bin/docker-compose
```

修改文件的执行权限为可执行

```bash
chmod +x /usr/local/bin/docker-compose
```

查看是否安装成功

```bash
docker-compose --version
```

## 2️⃣ 准备必要的配置文件

创建一个mall文件夹并将项目config中的文件复制到其下， 包括

* 数据库脚本`mall.sql`
* Nginx配置文件`nginx.conf`
* Logstash配置文件`logstash.conf`
* 依赖中间件配置脚本`pre-docker-compose.sh`
* 依赖中间件启动脚本`docker-compose-env.yaml`
* 项目服务启动脚本`docker-compose-app.yaml`

## 3️⃣ 启动中间件

1. 执行pre-docker-compose.sh

   ```bash
   sh pre-docker-compose.sh
   ```

   主要是创建一个`/mydata`目录，然后将配置文件复制到其中，以及给映射的volumes赋予权限，避免无法启动

2. 拉起中间件服务

   ```bash
   docker-compose -f docker-compose-env.yaml up -d
   ```

   运行时可以通过`docker stats`大致查看各个服务内存占用

3. 初始化mysql

   将mall.sql文件拷贝到mysql容器的/目录下

   ```bash
   docker cp mall.sql mysql:/
   docker exec -it mysql /bin/bash
   ```

   进入mysql容器并执行如下操作：

   ```sql
   #连接到mysql服务
   mysql -uroot -proot --default-character-set=utf8
   #创建mall数据库
   create database mall character set utf8;
   #使用mall数据库
   use mall;
   #导入mall.sql脚本
   source /mall.sql;
   
   ```

4. 给elasticsearch安装中文分词器

   下载与Elasticsearch对应的版本, 下载地址https://github.com/medcl/elasticsearch-analysis-ik/releases

   下载完成后加压到`/mydata/elasticsearch/plugins`目录下

   也可以执行以下命令安装

   ```bash
   # 下载压缩包
   curl -LO https://github.com/medcl/elasticsearch-analysis-ik/releases/download/v7.17.3/elasticsearch-analysis-ik-7.17.3.zip 
   # 解压压缩包到对应路径
   unzip elasticsearch-analysis-ik-7.17.3.zip  -d /mydata/elasticsearch/plugins
   # 删除压缩包
   rm -rf elasticsearch-analysis-ik-7.17.3.zip 
   ```

   重新启动服务

   ```bash
   docker restart elasticsearch
   ```

5. logstash安装json_lines插件

   ```bash
   docker exec -it logstash /bin/bash
   logstash-plugin install logstash-codec-json_lines
   docker restart logstash
   ```

6. rabbitmq创建用户并设置虚拟host

   访问管理页面

   账号密码：guest guest

   创建账号并设置其角色为管理眼: mall mall

   创建新虚拟host： /mall

   给mall用户配置host权限

## 4️⃣ 启动服务

上传镜像到服务器，可以手动打包上传，或者使用docker-maven-plugin插件直接打包到服务器（参考https://blog.51cto.com/lovebetterworld/2839888）

```bash
docker-compose -f docker-compose-app.yml up -d
```

如果防火墙和安全组都没问题，访问ip:8201即可使用swagger-ui(knife4j)进行项目调试。







