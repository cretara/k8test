package dev.cretara.k8test.config;

import dev.cretara.k8test.repository.IFilmRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.DataSourceInitializer;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class DatabaseInitConfiguration {

    @Lazy
    private final IFilmRepository filmRepository;

    @Bean
    public DataSourceInitializer dataSourceInitializer(DataSource dataSource) {
        DataSourceInitializer dataSourceInitializer = new DataSourceInitializer();
        dataSourceInitializer.setDataSource(dataSource);
        if (filmRepository.count() == 0L) {
            log.debug("Start database script initializer");
            ResourceDatabasePopulator databasePopulator = new ResourceDatabasePopulator();
            databasePopulator.addScript(new ClassPathResource("sql/dvdrental-database-startup.sql"));
        }
        return dataSourceInitializer;
    }

}
