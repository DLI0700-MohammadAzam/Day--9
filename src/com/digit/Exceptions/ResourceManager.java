package com.digit.Exceptions;

import java.io.IOException;

public class ResourceManager {
    public static void main(String[] args) {
        try (Resource resource = new Resource()) {
            resource.open();
            resource.use();
        } catch (IOException e) {
            System.err.println("Failed to close resource: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
