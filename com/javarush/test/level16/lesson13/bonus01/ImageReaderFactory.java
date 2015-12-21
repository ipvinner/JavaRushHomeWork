package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes imageType){

        ImageReader result = null;

        if(imageType == ImageTypes.BMP){
            result = new BmpReader();
        }else if(imageType == ImageTypes.JPG){
            result = new JpgReader();
        }else if(imageType == ImageTypes.PNG){
            result = new PngReader();
        }else{
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return result;
    }
}
