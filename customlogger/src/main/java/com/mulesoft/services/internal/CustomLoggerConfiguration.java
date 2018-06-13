package com.mulesoft.services.internal;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import com.mulesoft.services.internal.operation.CustomLoggerOperations;

/**
 * This class represents an extension configuration, values set in this class are commonly used across multiple
 * operations since they represent something core from the extension.
 */
@Operations(CustomLoggerOperations.class)
//@ConnectionProviders(CustomLoggerConnectionProvider.class)
public class CustomLoggerConfiguration {

  @Parameter
  private String configId;

  public String getConfigId(){
    return configId;
  }
}
