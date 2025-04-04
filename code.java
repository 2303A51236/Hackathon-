public class Main {
    public static boolean analyzeImage(String imageName) {
        // Simulated brightness analysis (random value for demonstration)
        double meanBrightness = Math.random() * 100;
        System.out.println("Analyzing: " + imageName);
        System.out.println("Mean Brightness: " + meanBrightness);
        
        if (meanBrightness < 50) {
            System.out.println("Flag: Poor lighting detected.");
            return true;
        }
        
        System.out.println("Image analysis complete. No issues detected.");
        return false;
    }
    
    public static void main(String[] args) {
        // Simulating analysis of 5 images
        String[] imageNames = {"image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg", "image5.jpg"};
        
        for (String imageName : imageNames) {
            analyzeImage(imageName);
        }
    }
}
