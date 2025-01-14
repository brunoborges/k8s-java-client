package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Nested;
import java.util.ArrayList;
import java.lang.String;
import java.util.function.Predicate;
import java.lang.Deprecated;
import java.util.Iterator;
import java.util.List;
import java.lang.Boolean;
import io.kubernetes.client.fluent.Fluent;
import java.lang.Integer;
import java.util.Collection;

 /**
  * Generated
  */
public interface V2HorizontalPodAutoscalerSpecFluent<A extends io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A>{
  
  /**
   * This method has been deprecated, please use method buildBehavior instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior getBehavior();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior buildBehavior();
  public A withBehavior(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior behavior);
  public java.lang.Boolean hasBehavior();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehavior();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> withNewBehaviorLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editBehavior();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehavior();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<A> editOrNewBehaviorLike(io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehavior item);
  public java.lang.Integer getMaxReplicas();
  public A withMaxReplicas(java.lang.Integer maxReplicas);
  public java.lang.Boolean hasMaxReplicas();
  public A addToMetrics(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricSpec item);
  public A setToMetrics(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricSpec item);
  public A addToMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... items);
  public A addAllToMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2MetricSpec> items);
  public A removeFromMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... items);
  public A removeAllFromMetrics(java.util.Collection<io.kubernetes.client.openapi.models.V2MetricSpec> items);
  public A removeMatchingFromMetrics(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricSpecBuilder> predicate);
  
  /**
   * This method has been deprecated, please use method buildMetrics instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public java.util.List<io.kubernetes.client.openapi.models.V2MetricSpec> getMetrics();
  public java.util.List<io.kubernetes.client.openapi.models.V2MetricSpec> buildMetrics();
  public io.kubernetes.client.openapi.models.V2MetricSpec buildMetric(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2MetricSpec buildFirstMetric();
  public io.kubernetes.client.openapi.models.V2MetricSpec buildLastMetric();
  public io.kubernetes.client.openapi.models.V2MetricSpec buildMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricSpecBuilder> predicate);
  public java.lang.Boolean hasMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricSpecBuilder> predicate);
  public A withMetrics(java.util.List<io.kubernetes.client.openapi.models.V2MetricSpec> metrics);
  public A withMetrics(io.kubernetes.client.openapi.models.V2MetricSpec... metrics);
  public java.lang.Boolean hasMetrics();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetric();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> addNewMetricLike(io.kubernetes.client.openapi.models.V2MetricSpec item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> setNewMetricLike(java.lang.Integer index,io.kubernetes.client.openapi.models.V2MetricSpec item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMetric(java.lang.Integer index);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editFirstMetric();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editLastMetric();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<A> editMatchingMetric(java.util.function.Predicate<io.kubernetes.client.openapi.models.V2MetricSpecBuilder> predicate);
  public java.lang.Integer getMinReplicas();
  public A withMinReplicas(java.lang.Integer minReplicas);
  public java.lang.Boolean hasMinReplicas();
  
  /**
   * This method has been deprecated, please use method buildScaleTargetRef instead.
   * @return The buildable object.
   */
  @java.lang.Deprecated
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference getScaleTargetRef();
  public io.kubernetes.client.openapi.models.V2CrossVersionObjectReference buildScaleTargetRef();
  public A withScaleTargetRef(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference scaleTargetRef);
  public java.lang.Boolean hasScaleTargetRef();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRef();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> withNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editScaleTargetRef();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRef();
  public io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<A> editOrNewScaleTargetRefLike(io.kubernetes.client.openapi.models.V2CrossVersionObjectReference item);
  public interface BehaviorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerBehaviorFluent<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.BehaviorNested<N>>{
    public N and();
    public N endBehavior();
    
  }
  public interface MetricsNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2MetricSpecFluent<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.MetricsNested<N>>{
    public N and();
    public N endMetric();
    
  }
  public interface ScaleTargetRefNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V2CrossVersionObjectReferenceFluent<io.kubernetes.client.openapi.models.V2HorizontalPodAutoscalerSpecFluent.ScaleTargetRefNested<N>>{
    public N and();
    public N endScaleTargetRef();
    
  }
  
}