/*************************************************************************
 * Copyright 2009-2014 Ent. Services Development Corporation LP
 *
 * Redistribution and use of this software in source and binary forms,
 * with or without modification, are permitted provided that the
 * following conditions are met:
 *
 *   Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 *   Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer
 *   in the documentation and/or other materials provided with the
 *   distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
 * LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
 * ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 ************************************************************************/
package com.eucalyptus.cloudformation.common.msgs;

public class CreateStackType extends CloudFormationMessage {

  private ResourceList capabilities;
  private Boolean disableRollback;
  private ResourceList notificationARNs;
  private String onFailure;
  private Parameters parameters;
  private ResourceList resourceTypes;
  private String stackName;
  private String stackPolicyBody;
  private String stackPolicyURL;
  private Tags tags;
  private String templateBody;
  private String templateURL;
  private Integer timeoutInMinutes;

  public ResourceList getCapabilities( ) {
    return capabilities;
  }

  public void setCapabilities( ResourceList capabilities ) {
    this.capabilities = capabilities;
  }

  public Boolean getDisableRollback( ) {
    return disableRollback;
  }

  public void setDisableRollback( Boolean disableRollback ) {
    this.disableRollback = disableRollback;
  }

  public ResourceList getNotificationARNs( ) {
    return notificationARNs;
  }

  public void setNotificationARNs( ResourceList notificationARNs ) {
    this.notificationARNs = notificationARNs;
  }

  public String getOnFailure( ) {
    return onFailure;
  }

  public void setOnFailure( String onFailure ) {
    this.onFailure = onFailure;
  }

  public Parameters getParameters( ) {
    return parameters;
  }

  public void setParameters( Parameters parameters ) {
    this.parameters = parameters;
  }

  public ResourceList getResourceTypes( ) {
    return resourceTypes;
  }

  public void setResourceTypes( ResourceList resourceTypes ) {
    this.resourceTypes = resourceTypes;
  }

  public String getStackName( ) {
    return stackName;
  }

  public void setStackName( String stackName ) {
    this.stackName = stackName;
  }

  public String getStackPolicyBody( ) {
    return stackPolicyBody;
  }

  public void setStackPolicyBody( String stackPolicyBody ) {
    this.stackPolicyBody = stackPolicyBody;
  }

  public String getStackPolicyURL( ) {
    return stackPolicyURL;
  }

  public void setStackPolicyURL( String stackPolicyURL ) {
    this.stackPolicyURL = stackPolicyURL;
  }

  public Tags getTags( ) {
    return tags;
  }

  public void setTags( Tags tags ) {
    this.tags = tags;
  }

  public String getTemplateBody( ) {
    return templateBody;
  }

  public void setTemplateBody( String templateBody ) {
    this.templateBody = templateBody;
  }

  public String getTemplateURL( ) {
    return templateURL;
  }

  public void setTemplateURL( String templateURL ) {
    this.templateURL = templateURL;
  }

  public Integer getTimeoutInMinutes( ) {
    return timeoutInMinutes;
  }

  public void setTimeoutInMinutes( Integer timeoutInMinutes ) {
    this.timeoutInMinutes = timeoutInMinutes;
  }
}