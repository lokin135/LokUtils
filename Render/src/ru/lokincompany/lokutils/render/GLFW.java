package ru.lokincompany.lokutils.render;

import static org.lwjgl.glfw.GLFW.*;

public class GLFW {

    private static boolean inited;

    public static synchronized boolean init() {
        if (!inited)
            inited = glfwInit();

        glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);

        return inited;
    }

}