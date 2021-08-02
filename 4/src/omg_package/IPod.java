package omg_package;

public class IPod extends Apple{
	private String music;
	private boolean skin;
	public IPod(int p, int g, String c, String s) throws Exception {
		super(p, g, c, s);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the music
	 */
	public String getMusic() {
		return music;
	}
	/**
	 * @param music the music to set
	 */
	public void setMusic(String music) {
		this.music = music;
	}
	public void customize(String newColor,boolean a) {
		setColor(newColor);
		setGuarantee(false);
		setSkin(a);
	}
	/**
	 * @return the skin
	 */
	public boolean isSkin() {
		return skin;
	}
	/**
	 * @param skin the skin to set
	 */
	public void setSkin(boolean skin) {
		this.skin = skin;
	}
	public String toString(){
        String strPrice = "Price of the iPod: "+ getPrice(), strGeneration = " Generation of the iPod: "+getGeneration(), strColor = " Color of the iPod: "+getColor(), 
        		strSize = " Size of the iPod: "+ getSize(), strSkin = " Did it have skin?:" + isSkin();
        
        return strPrice + strGeneration + strColor + strSize + strSkin;
    }

}
