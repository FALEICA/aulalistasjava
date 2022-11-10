package entidade;

public class Produto {
	private String prodName;

	public Produto(String prodName) {
		this.setProdName(prodName);
	}
	
	public void mostraProduto() {
		System.out.println("OK ENTROU NO PRODUTO . . ." + this.prodName);
		
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	
	
	
	
	

}
