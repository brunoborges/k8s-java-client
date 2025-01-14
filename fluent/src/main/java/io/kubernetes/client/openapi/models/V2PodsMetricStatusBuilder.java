package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;
public class V2PodsMetricStatusBuilder extends io.kubernetes.client.openapi.models.V2PodsMetricStatusFluentImpl<io.kubernetes.client.openapi.models.V2PodsMetricStatusBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V2PodsMetricStatus,io.kubernetes.client.openapi.models.V2PodsMetricStatusBuilder>{
  public V2PodsMetricStatusBuilder() {
    this(false);
  }
  public V2PodsMetricStatusBuilder(java.lang.Boolean validationEnabled) {
    this(new V2PodsMetricStatus(), validationEnabled);
  }
  public V2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<?> fluent) {
    this(fluent, false);
  }
  public V2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<?> fluent,java.lang.Boolean validationEnabled) {
    this(fluent, new V2PodsMetricStatus(), validationEnabled);
  }
  public V2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2PodsMetricStatus instance) {
    this(fluent, instance, false);
  }
  public V2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<?> fluent,io.kubernetes.client.openapi.models.V2PodsMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = fluent; 
    fluent.withCurrent(instance.getCurrent());

    fluent.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  public V2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2PodsMetricStatus instance) {
    this(instance,false);
  }
  public V2PodsMetricStatusBuilder(io.kubernetes.client.openapi.models.V2PodsMetricStatus instance,java.lang.Boolean validationEnabled) {
    this.fluent = this; 
    this.withCurrent(instance.getCurrent());

    this.withMetric(instance.getMetric());

    this.validationEnabled = validationEnabled; 
  }
  io.kubernetes.client.openapi.models.V2PodsMetricStatusFluent<?> fluent;
  java.lang.Boolean validationEnabled;
  public io.kubernetes.client.openapi.models.V2PodsMetricStatus build() {
    V2PodsMetricStatus buildable = new V2PodsMetricStatus();
    buildable.setCurrent(fluent.getCurrent());
    buildable.setMetric(fluent.getMetric());
    return buildable;
  }
  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V2PodsMetricStatusBuilder that = (V2PodsMetricStatusBuilder) o;
    if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

    if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
    return true;
  }
  public int hashCode() {
    return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
  }
  
}