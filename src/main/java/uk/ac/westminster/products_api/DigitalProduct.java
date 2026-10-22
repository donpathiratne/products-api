package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{
    private String downloadUrl;
    private double fileSizeMB;

    // constructor
    public DigitalProduct(){}

    public DigitalProduct(Long id,
                          String name,
                          double prize,
                          String downloadUrl,
                          double fileSizeMB){
        super(id, name, prize);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    // getters
    public String getDownloadUrl(){
        return downloadUrl;
    }

    public double getFileSizeMB(){
        return fileSizeMB;
    }

    //setters
    public void setDownloadUrl(String downloadUrl){
        this.downloadUrl = downloadUrl;
    }

    public void setFileSizeMB(double fileSizeMB){
        this.fileSizeMB = fileSizeMB;
    }
}
