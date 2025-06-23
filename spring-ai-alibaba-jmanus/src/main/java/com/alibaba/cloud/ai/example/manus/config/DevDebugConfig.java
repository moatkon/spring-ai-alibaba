package com.alibaba.cloud.ai.example.manus.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevDebugConfig {

  @Value("${devDebug:false}")
  private Boolean devDebug;

  public Boolean getDevDebug() {
    return devDebug;
  }

  public void setDevDebug(Boolean devDebug) {
    this.devDebug = devDebug;
  }
}
