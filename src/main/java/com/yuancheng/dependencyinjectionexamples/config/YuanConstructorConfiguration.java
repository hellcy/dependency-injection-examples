package com.yuancheng.dependencyinjectionexamples.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties("yuan")
public class YuanConstructorConfiguration {
  private final String username;
  private final String password;
  private final String jdbcUrl;

  public YuanConstructorConfiguration(String username, String password, String jdbcUrl) {
    this.username = username;
    this.password = password;
    this.jdbcUrl = jdbcUrl;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getJdbcUrl() {
    return jdbcUrl;
  }
}
