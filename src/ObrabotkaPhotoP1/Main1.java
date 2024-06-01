package ObrabotkaFoto.Functions.ObrabotkaPhotoP1;

import ObrabotkaFoto.Functions.FilterOperations;
import Utils.ImageUtils;
import Utils.RGBMaster;

import java.awt.image.BufferedImage;

public class Main1 {
    public static void main(String[] args) throws Exception {
        final BufferedImage image = ImageUtils.getImage("Images/dewushka.png");
        final RGBMaster rgbMaster = new RGBMaster(image);
        rgbMaster.changeImage(FilterOperations::sepia);
        ImageUtils.saveImage(rgbMaster.getImage(),"Images/cloned.png");
        System.out.println("done!");
    }
}
