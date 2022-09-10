package online.pengpeng.mall.component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import online.pengpeng.mall.service.UmsResourceService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 加载Role Rule Map到Redis中
 * 系统初始化后运行
 * @author pengpeng
 * @date 2022/8/29
 */
@AllArgsConstructor
@Slf4j
@Component
public class ResourceRoleRulesRunner implements CommandLineRunner {
    private final UmsResourceService resourceService;


    @Override
    public void run(String... args) throws Exception {
        resourceService.initResourceRolesMap();
        log.info("load RoleRuleMap to redis success");
    }

    /**
     * cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 10秒更新一次
     * */
    @Scheduled(cron = "0/10 * * ? * ?")
    private void update() {
        resourceService.initResourceRolesMap();
        log.debug("update resource map");
    }
}
