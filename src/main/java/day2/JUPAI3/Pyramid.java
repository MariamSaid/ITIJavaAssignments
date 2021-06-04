package day2.JUPAI3;

/**
 *
 * @author top
 */
public class Pyramid {

    private String pharaoh;
    private String modernName;
    private double height;
    private String site;

    public Pyramid() {
    }

    public Pyramid(String pharaoh, String modernName, String site, double height) {

        this.pharaoh = pharaoh;

        this.modernName = modernName;

        this.height = height;

        this.site = site;
    }

    public String getPharaoh() {
        return pharaoh;
    }

    public String getModernName() {
        return modernName;
    }

    public double getHeight() {
        return height;
    }

    public String getSite() {
        return site;
    }

    public void setPharaoh(String pharaoh) {

        this.pharaoh = pharaoh;

    }

    public void setModernName(String modernName) {
        this.modernName = modernName;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {

        return getPharaoh() + " " + getModernName() + " " + getSite() + " " + getHeight();
//        return String.format("%s", getPharaoh())+String.format("%.50s", getModernName())+
//                String.format("%.20s", getSite())+String.format("%.5s", getHeight());
    }
}
