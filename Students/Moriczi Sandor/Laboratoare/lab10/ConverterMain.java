package convert54;

public class ConverterMain {

	public static void main(String[] args) {
		ConverView view =new ConverView();
		ConverterModel model= new ConverterModel();
		ConverterController contr = new ConverterController(model, view);
		view.setVisible(true);

	}

}
