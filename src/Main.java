import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {

        Pais argentina = new Pais("Argentina");
        Pais brasil = new Pais("Brasil");
        System.out.println("País 1: " + argentina);
        System.out.println("País 2: " + brasil);
        System.out.println("---");


        Provincia mendoza = new Provincia("Mendoza", argentina);
        Provincia buenosAires = new Provincia("Buenos Aires", argentina);
        System.out.println("Provincia 1: " + mendoza);
        System.out.println("Provincia 2: " + buenosAires);
        System.out.println("---");


        Localidad lasHeras = new Localidad("Las Heras", mendoza);
        Localidad capital = new Localidad("Capital", mendoza);
        System.out.println("Localidad 1: " + lasHeras);
        System.out.println("Localidad 2: " + capital);
        System.out.println("---");


        Domicilio domicilio1 = new Domicilio("San Martín", 123, 5500, lasHeras);
        Domicilio domicilio2 = new Domicilio("Rivadavia", 456, 5501, capital);
        System.out.println("Domicilio 1: " + domicilio1);
        System.out.println("Domicilio 2: " + domicilio2);
        System.out.println("---");


        Empresa empresa1 = new Empresa("Los Andes S.A.", "Restaurante Los Andes", 30987);
        Empresa empresa2 = new Empresa( "Sabores del Sur SRL", "Sabores del Sur", 30112);
        System.out.println("Empresa 1: " + empresa1);
        System.out.println("Empresa 2: " + empresa2);
        System.out.println("---");


        Sucursal sucursal1 = new Sucursal("Sucursal Centro", LocalTime.of(9, 0), LocalTime.of(23, 0), domicilio1);
        Sucursal sucursal2 = new Sucursal("Sucursal Norte", LocalTime.of(8, 30), LocalTime.of(22, 30), domicilio2);
        empresa1.addscursales(sucursal1);
        empresa2.addscursales(sucursal2);
        System.out.println("Sucursal 1: " + sucursal1);
        System.out.println("Sucursal 2: " + sucursal2);
        System.out.println("---");


        UnidadMedida unidad1 = new UnidadMedida("Porción");
        UnidadMedida unidad2 = new UnidadMedida("Litro");
        System.out.println("Unidad de Medida 1: " + unidad1);
        System.out.println("Unidad de Medida 2: " + unidad2);
        System.out.println("---");


        Imagen imagen1 = new Imagen("pizza_muzzarella.jpg");
        Imagen imagen2 = new Imagen("empanada_carne.jpg");
        System.out.println("Imagen 1: " + imagen1);
        System.out.println("Imagen 2: " + imagen2);
        System.out.println("---");


        ArticuloInsumo harina = new ArticuloInsumo("Harina 000", 50.0, unidad1, 30.0, 100, 200, true);
        ArticuloInsumo quesoMuzzarella = new ArticuloInsumo("Queso Muzzarella", 500.0, unidad1, 350.0, 50, 100, true);
        System.out.println("Artículo Insumo 1: " + harina);
        System.out.println("Artículo Insumo 2: " + quesoMuzzarella);
        System.out.println("---");


        ArticuloManufacturado pizzaMuzzarella = new ArticuloManufacturado("Pizza Muzzarella", 800.0, unidad1, "Clásica pizza de muzzarella", 30, "Hornear");
        ArticuloManufacturado empanadaCarne = new ArticuloManufacturado("Empanada de Carne", 150.0, unidad1, "Empanada criolla de carne", 20, "Hornear");
        pizzaMuzzarella.addImagen(imagen1);
        empanadaCarne.addImagen(imagen2);
        sucursal1.addCtegoia(new Categoria("Pizzas")); // Asumiendo que la categoría ya existe o se crea acá
        sucursal1.addCtegoia(new Categoria("Empanadas"));
        System.out.println("Artículo Manufacturado 1: " + pizzaMuzzarella);
        System.out.println("Artículo Manufacturado 2: " + empanadaCarne);
        System.out.println("---");


        ArticuloManufacturadoDetalle detallePizza1 = new ArticuloManufacturadoDetalle(200, harina);
        ArticuloManufacturadoDetalle detallePizza2 = new ArticuloManufacturadoDetalle(300, quesoMuzzarella);
        pizzaMuzzarella.addArticuloDetalle(detallePizza1);
        pizzaMuzzarella.addArticuloDetalle(detallePizza2);
        System.out.println("Detalle Artículo Manufacturado 1: " + detallePizza1);
        System.out.println("Detalle Artículo Manufacturado 2: " + detallePizza2);
        System.out.println("---");


        Categoria pizzas = new Categoria("Pizzas");
        Categoria empanadas = new Categoria("Empanadas");
        pizzas.addArticulo(pizzaMuzzarella);
        empanadas.addArticulo(empanadaCarne);
        sucursal1.addCtegoia(pizzas);
        sucursal1.addCtegoia(empanadas);
        System.out.println("Categoría 1: " + pizzas);
        System.out.println("Categoría 2: " + empanadas);
        System.out.println("---");


        Promocion happyHour = new Promocion("Happy Hour Pizza", LocalDate.now(), LocalDate.now().plusDays(7), LocalTime.of(18, 0), LocalTime.of(20, 0), "2x1 en Pizzas", 800.0, TipoPromocion.HAPPYHOUR);
        Promocion martesLoco = new Promocion("Martes de Empanadas", LocalDate.now().plusDays(2), LocalDate.now().plusDays(2), LocalTime.of(0, 0), LocalTime.of(23, 59), "30% off en Empanadas", 105.0, TipoPromocion.PROMOCION1);
        happyHour.addArticulo(pizzaMuzzarella);
        martesLoco.addArticulo(empanadaCarne);
        sucursal1.addPromocion(happyHour);
        sucursal2.addPromocion(martesLoco);
        System.out.println("Promoción 1: " + happyHour);
        System.out.println("Promoción 2: " + martesLoco);
        System.out.println("---");

        Usuario usuario1 = new Usuario("auth0|123", "juan123");
        Usuario usuario2 = new Usuario("auth0|456", "maria456");
        System.out.println("Usuario 1: " + usuario1);
        System.out.println("Usuario 2: " + usuario2);
        System.out.println("---");


        Cliente cliente1 = new Cliente("Juan", "Pérez", "2611234567", "juan.perez@email.com", LocalDate.of(1990, 5, 15));
        Cliente cliente2 = new Cliente("María", "González", "2617654321", "maria.gonzalez@email.com", LocalDate.of(1985, 10, 20));
        cliente1.setUsuario(usuario1);
        cliente2.setUsuario(usuario2);
        System.out.println("Cliente 1: " + cliente1);
        System.out.println("Cliente 2: " + cliente2);
        System.out.println("---");


        Pedido pedido1 = new Pedido(LocalTime.of(20, 0), 800.0, 450.0, Estado.PENDIENTE, TipoEnvio.DELIVERY, FormaPago.EFECTIVO, LocalDate.now(), null);
        Pedido pedido2 = new Pedido(LocalTime.of(21, 30), 300.0, 180.0, Estado.PREPARACION, TipoEnvio.TAKEAWAY, FormaPago.MERCADOPAGO, LocalDate.now(), null);
        cliente1.addPedido(pedido1);
        cliente2.addPedido(pedido2);
        pedido1.setSucursal(sucursal1);
        pedido2.setSucursal(sucursal2);
        pedido1.setDomicilio(cliente1.getDomicilios().stream().findFirst().orElse(null));
        pedido2.setDomicilio(cliente2.getDomicilios().stream().findFirst().orElse(null));
        System.out.println("Pedido 1: " + pedido1);
        System.out.println("Pedido 2: " + pedido2);
        System.out.println("---");


        DetallePedido detalle1 = new DetallePedido(1, 800.0, pizzaMuzzarella);
        DetallePedido detalle2 = new DetallePedido(2, 300.0, empanadaCarne);
        pedido1.addDetallePedido(detalle1);
        pedido2.addDetallePedido(detalle2);
        System.out.println("Detalle Pedido 1: " + detalle1);
        System.out.println("Detalle Pedido 2: " + detalle2);
        System.out.println("---");

        Factura factura1 = new Factura(LocalDate.now(), 800.0, FormaPago.EFECTIVO, 12345, null, null, null);
        Factura factura2 = new Factura(LocalDate.now(), 300.0, FormaPago.MERCADOPAGO, 67890, 54321, "pref123", "credit_card");
        pedido1.setFactura(factura1);
        pedido2.setFactura(factura2);
        System.out.println("Factura 1: " + factura1);
        System.out.println("Factura 2: " + factura2);
        System.out.println("---");
    }
}