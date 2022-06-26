package logic;

import java.util.*;
import logic.Sale;

public class Runner {
	public static void main(String[] args) {

		Sale sale = new Sale("", "", (double) 0, (byte) 0, false, (short) 0);
		Scanner sc = new Scanner(System.in);
		System.out.println("Bienvenido al nuevo sistema de compras virtual de La Canasta\n"
				+ "A continuacion elija una opcion valida:\n" + "\n" + "1. Comprar Productos\n" + "2. Salir");
		int leer = 0;
		leer = sc.nextInt();
		switch (leer) {
		case 1:
			System.out.println("Comprar Productos");
			boolean comprar = true;
			do {

				System.out.println("Escriba el producto que desea comprar: ");
				sc.nextLine();
				String producto = "";
				producto = sc.nextLine();

				// asigno valores al set del Sale para poder utilizar metodo del Iva
				sale.setNameProduct(producto);

				System.out.println("Digite el valor del producto");
				double valor = 0;
				valor = sc.nextDouble();
				sale.setUnitValue(valor);

				System.out.println("Digite la cantidad de productos que desea comprar");
				int cantidad = 0;
				cantidad = sc.nextInt();

				System.out.println("Que tipo de producto es?\n" + "1. Medicinas\n" + "2. Licores\n"
						+ "3. Productos de Aseo\n" + "4. Viveres\n");

				leer = sc.nextInt();
				sale.setTypeProduct((byte) leer);
				switch (leer) {
				case 1:
					System.out.println("Venta");
					System.out.println("Producto: " + sale.getNameProduct());
					System.out.println("Precio: " + sale.getUnitValue());
					System.out.println("Cantidad: " + cantidad);
					System.out.println("Valor con descuento: " + sale.calcDiscount());
					System.out.println("Tipo de producto: Medicina");
					System.out.println("Precio con IVA");
					System.out.println(sale.calcIVA() * cantidad);

					break;
				case 2:

					System.out.println("Licores");
					System.out.println("Venta");
					System.out.println("Producto: " + sale.getNameProduct());
					System.out.println("Precio: " + sale.getUnitValue());
					System.out.println("Cantidad: " + cantidad);
					System.out.println("Valor con descuento: " + sale.calcDiscount());
					System.out.println("Tipo de producto: Licores");
					System.out.println("Precio con IVA");
					System.out.println(sale.calcIVA() * cantidad);

					break;
				case 3:

					System.out.println("Productos de Aseo");
					System.out.println("Venta");
					System.out.println("Producto: " + sale.getNameProduct());
					System.out.println("Precio: " + sale.getUnitValue());
					System.out.println("Cantidad: " + cantidad);
					System.out.println("Valor con descuento: " + sale.calcDiscount());
					System.out.println("Tipo de producto: Productos de Aseo");
					System.out.println("Precio con IVA");
					System.out.println(sale.calcIVA() * cantidad);

					break;
				case 4:

					System.out.println("Viveres");
					System.out.println("Venta");
					System.out.println("Producto: " + sale.getNameProduct());
					System.out.println("Precio: " + sale.getUnitValue());
					System.out.println("Cantidad: " + cantidad);
					System.out.println("Valor con descuento: " + sale.calcDiscount());
					System.out.println("Tipo de producto: Viveres");
					System.out.println("Precio con IVA");
					System.out.println(sale.calcIVA() * cantidad);

					break;

				default:
					break;
				}

				System.out.println("¿Deseas hacer más compras?");
				leer = sc.nextInt();
				switch (leer) {
				case 1:
					comprar = true;
					break;
				case 2:
					comprar = false;
				default:
					break;

				}
			} while (comprar == true);
			break;
		case 2:
			System.out.println("Salir");
			break;

		default:
			break;
		}
	}
}
