package com.tutoraca.firstProject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // 1. execution(): exact method match
    @Before("execution(public String com.tutoraca.firstProject.controller.EmployeeController.fetchEmployee())")
    public void beforeFetchEmployee() {
        System.out.println("inside beforeFetchEmployee Aspect");
    }

    // 2. execution(): same advice for all fetchEmployeeDetails methods
    // Java does not allow same method name with only different return type.
    // So here we use same method name with different parameters.
    @Before("execution(* com.tutoraca.firstProject.controller.EmployeeController.fetchEmployeeDetails(..))")
    public void beforeFetchEmployeeDetails() {
        System.out.println("inside same logger for all fetchEmployeeDetails methods");
    }

    // 3. execution(): matches any method with single String parameter
    @Before("execution(* com.tutoraca.firstProject.controller.EmployeeController.*(String))")
    public void beforeMethodWithSingleStringParameter() {
        System.out.println("inside execution for methods with single String parameter");
    }

    // 4. execution(): matches fetchEmployeeById with any one parameter
    @Before("execution(* com.tutoraca.firstProject.controller.EmployeeController.fetchEmployeeById(*))")
    public void beforeFetchEmployeeById() {
        System.out.println("inside execution for fetchEmployeeById(*)");
    }

    // 5. within(): matches all methods inside one class
    @Before("within(com.tutoraca.firstProject.controller.EmployeeWithinController)")
    public void beforeWithinExample(JoinPoint joinPoint) {
        System.out.println("inside within Aspect: " + joinPoint.getSignature().getName());
    }

    // 6. @within(): matches any method inside a class having @Service
    @Before("@within(org.springframework.stereotype.Service)")
    public void beforeAtWithinExample() {
        System.out.println("inside @within Aspect for @Service class");
    }

    // 7. args(): matches method with String and int arguments
    @Before("execution(* com.tutoraca.firstProject.service.EmployeeUtil.employeeHelperMethod(..)) && args(str, val)")
    public void beforeArgsExample(String str, int val) {
        System.out.println("inside args Aspect");
        System.out.println("String value = " + str);
        System.out.println("int value = " + val);
    }

    // 8. @args(): matches when argument object's class has @Service
    @Before("execution(* com.tutoraca.firstProject.service.EmployeeUtil.employeeDaoHelperMethod(..)) && @args(org.springframework.stereotype.Service)")
    public void beforeAtArgsExample() {
        System.out.println("inside @args Aspect");
    }

    // 9. @annotation: matches methods having custom annotation
    @Before("@annotation(com.tutoraca.firstProject.aspect.LogMessage)")
    public void beforeAnnotationExample() {
        System.out.println("inside @annotation Aspect");
    }
}
