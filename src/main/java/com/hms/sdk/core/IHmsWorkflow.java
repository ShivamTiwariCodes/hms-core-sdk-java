package com.hms.sdk.core;

import io.temporal.workflow.WorkflowInterface;
import io.temporal.workflow.WorkflowMethod;

@WorkflowInterface
public interface IHmsWorkflow {
    @WorkflowMethod
    RoutineResponse execute(CustomArgs customArgs);
}
