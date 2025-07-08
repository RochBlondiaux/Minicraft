package com.mojang.ld22.utils;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ImageUtils {

    public static BufferedImage resource(String path) {
        try (InputStream in = ImageUtils.class.getClassLoader().getResourceAsStream(path)) {
            if (in == null)
                throw new IOException("Resource not found: " + path);
            return ImageIO.read(in);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load image from path: " + path, e);
        }
    }
}
