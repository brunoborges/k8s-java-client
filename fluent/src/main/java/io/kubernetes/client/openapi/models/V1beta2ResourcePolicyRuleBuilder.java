package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V1beta2ResourcePolicyRuleBuilder extends io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluentImpl<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule,io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleBuilder>{
  public V1beta2ResourcePolicyRuleBuilder() {
    this(false);
  }
  public V1beta2ResourcePolicyRuleBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta2ResourcePolicyRule(), validationEnabled);
  }
  public V1beta2ResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluent<?> fluent) {
    this(fluent, false);
  }
  public V1beta2ResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta2ResourcePolicyRule(), validationEnabled);
  }
  public V1beta2ResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule instance) {
    this(fluent, instance, false);
  }
  public V1beta2ResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluent<?> fluent,io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withApiGroups(instance.getApiGroups());

    fluent.withClusterScope(instance.getClusterScope());

    fluent.withNamespaces(instance.getNamespaces());

    fluent.withResources(instance.getResources());

    fluent.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  public V1beta2ResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule instance) {
    this(instance,false);
  }
  public V1beta2ResourcePolicyRuleBuilder(io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withApiGroups(instance.getApiGroups());

    this.withClusterScope(instance.getClusterScope());

    this.withNamespaces(instance.getNamespaces());

    this.withResources(instance.getResources());

    this.withVerbs(instance.getVerbs());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRuleFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V1beta2ResourcePolicyRule build() {
    V1beta2ResourcePolicyRule buildable = new V1beta2ResourcePolicyRule();
    buildable.setApiGroups(fluent.getApiGroups());
    buildable.setClusterScope(fluent.getClusterScope());
    buildable.setNamespaces(fluent.getNamespaces());
    buildable.setResources(fluent.getResources());
    buildable.setVerbs(fluent.getVerbs());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta2ResourcePolicyRuleBuilder that = (V1beta2ResourcePolicyRuleBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}