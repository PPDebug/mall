# 复制nginx配置文件
mkdir -pv /mydata/nginx/conf/
cp nginx.conf /mydata/nginx/conf/
# 复制logstash配置文件
mkdir -pv /mydata/logstash/
cp logstash.conf /mydata/logstash/
# 给elasticsearch挂载的卷设置权限
mkdir -pv /mydata/elasticsearch/data
chmod -R 777 /mydata/elasticsearch/data
# 给rabbitmq挂载的卷设置权限
mkdir -pv /mydata/rabbitmq/log
chmod -R 777 /mydata/rabbitmq/log

