package com.healthcheckpro;

import java.lang.reflect.Method;

public class HealthCheckPro {

	public static void scanClass(Class<?> clazz) {

		System.out.println("Scanning API: " + clazz.getSimpleName());

		Method[] methods = clazz.getDeclaredMethods();

		for (Method method : methods) {

			boolean isPublicAPI = method.isAnnotationPresent(PublicAPI.class);
			boolean isSecured = method.isAnnotationPresent(RequiresAuth.class);

			if (!isPublicAPI && !isSecured) {
				System.out.println("WARNING: Method '" + method.getName() + "' has no API annotation");
			} else {
				generateDoc(method);
			}
		}
	}

	private static void generateDoc(Method method) {

		System.out.println("API Method: " + method.getName());

		if (method.isAnnotationPresent(PublicAPI.class)) {
			PublicAPI api = method.getAnnotation(PublicAPI.class);
			System.out.println("  Access: Public");
			System.out.println("  Description: " + api.description());
		}

		if (method.isAnnotationPresent(RequiresAuth.class)) {
			RequiresAuth auth = method.getAnnotation(RequiresAuth.class);
			System.out.println("  Access: Secured");
			System.out.println("  Role Required: " + auth.role());
		}

		System.out.println("----------------------------------");
	}
}
