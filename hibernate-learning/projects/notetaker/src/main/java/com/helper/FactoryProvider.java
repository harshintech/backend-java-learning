package com.helper;


import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class FactoryProvider {
    private static SessionFactory factory;

    public static SessionFactory getFactory() {
        if (factory == null) {
            // Build registry
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure() // reads hibernate.cfg.xml from classpath
                    .build();

            try {
                // Build metadata
                Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

                // Build session factory
                factory = metadata.getSessionFactoryBuilder().build();
            } catch (Exception e) {
                // If something fails, destroy registry to avoid memory leaks
                StandardServiceRegistryBuilder.destroy(registry);
                e.printStackTrace();
            }
        }
        return factory;
    }

    public static void closeFactory() {
        if (factory != null && factory.isOpen()) {
            factory.close();
        }
    }
}
