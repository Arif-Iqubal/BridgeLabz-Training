package com.eventtracker;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AuditTrail {

	String action(); // LOGIN, UPLOAD, DELETE, etc.

	String description(); // Human-readable info
}
