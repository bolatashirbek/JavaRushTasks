package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by Bolat Ashirbek on 07.10.2019.
 */

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {
        try {
            switch (jpg) {
                case BMP:
                    return new BmpReader();
                case JPG:
                    return new JpgReader();
                case PNG:
                    return new PngReader();
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return null;
    }
}
