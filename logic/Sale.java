package logic;

public class Sale {
	//Atributos
	private String idSale;
	private String nameProduct;
	private double unitValue;
	private byte typeProduct;
	private boolean engraved;
	private short cantSale;
	
	

	//constantes
	public byte MEDICINE = 1;
	public byte LIQUEUR = 2;
	public byte CLEANNESS = 3;
	public byte VICTUALS = 4;
	
	
	

	
	
	public Sale(String idSale,String nameProduct,double unitValue,byte typeProduct,boolean engraved,short cantSale ){
		this.idSale=idSale;
		this.nameProduct=nameProduct;
		this.unitValue=unitValue;
		this.typeProduct=typeProduct;
		this.engraved=engraved;
		this.cantSale=cantSale;
	}

	public String getIdSale(String idSale) {
		return idSale;
	}

	public void setIdSale(String idSale) {
		this.idSale = idSale;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public double getUnitValue() {
		return unitValue;
	}

	public void setUnitValue(double unitValue) {
		this.unitValue = unitValue;
	}

	public byte getTypeProduct() {
		return typeProduct;
	}

	public void setTypeProduct(byte typeProduct) {
		this.typeProduct = typeProduct;
	}

	public boolean isEngraved() {
		return engraved;
	}

	public void setEngraved(boolean engraved) {
		this.engraved = engraved;
	}
	
	public short getCantSale() {
		return cantSale;
	}

	public void setCantSale(short cantSale) {
		this.cantSale = cantSale;
	}
	
	//Metodos
	
	public double calcIVA() {
		double iva=0;
		if(typeProduct==1) {
			iva=unitValue*0.1;
				return iva;
		}else if(typeProduct==2){
			iva=unitValue*0.19;
			return iva;
		}else if(typeProduct==3){
			iva=unitValue*0.12;
			return iva;
		}else if(typeProduct==4){
			iva=unitValue*0.8;
			return iva;
			}
	return 0.0;	
	}
	
    public double  calcDiscount() {
    	
    	   double descuento = 0;
    	   double porcentaje = 0;
    	   
    	 if(cantSale < 10) {
    		descuento = 0;
    		return descuento;
    	 }else if(10 <= cantSale && cantSale <= 20) {
    		porcentaje = unitValue * 0.05;
    		descuento = unitValue - porcentaje;
    		return descuento;
    		
    	}else if(21 <= cantSale && cantSale <= 50) {
    		porcentaje = unitValue * 0.1;
    		descuento = unitValue - porcentaje;
    		return descuento;
    		
    	}else if(51 <= cantSale && cantSale <= 100) {
    		porcentaje = unitValue * 0.15;
    		descuento = unitValue - porcentaje;
    		return descuento;
    		
    	}else if(101 <= cantSale ) {
    		porcentaje = unitValue * 0.2;
    		descuento = unitValue - porcentaje;
    		return descuento;
    				
    	}
    	return 0.0;
	}
    
}
    
 
    
	
	
	
    
	
	
	
	
	


