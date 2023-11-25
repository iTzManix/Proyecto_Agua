public class Main
{
    public static void main(String[] args)
    {
        Casa casa1  = new Casa("Jaime Lopez", true);
        Casa casa2  = new Casa("Carmen Choque", true);
        Casa casa3  = new Casa("Rosmeri Carvajal", true);

        LDoble_Manzana listaManzana1 = new LDoble_Manzana();
        listaManzana1.adicion(casa1);
        listaManzana1.adicion(casa2);
        listaManzana1.adicion(casa3);

        Casa casa4 = new Casa("Edwin Mamani", true);
        Casa casa5 = new Casa("Kevin Ticona", true);
        Casa casa6 = new Casa("Javier Miler", false);
        LDoble_Manzana listaManzana2 = new LDoble_Manzana();
        listaManzana2.adicion(casa4);
        listaManzana2.adicion(casa5);
        listaManzana2.adicion(casa6);

        Zona zona1 = new Zona("Alto las Delicias", "Hampaturi", listaManzana1);
        zona1.adicionarManzana(listaManzana2);

        Casa casa7 = new Casa("Gabriel Morales", true);
        Casa casa8 = new Casa("Luz Flores", false);
        Casa casa9 = new Casa("Mario Gomez", true);

        LDoble_Manzana listaManzana3 = new LDoble_Manzana();
        listaManzana3.adicion(casa7);
        listaManzana3.adicion(casa8);
        listaManzana3.adicion(casa9);

        Casa casa10 = new Casa("Laura Torres", false);
        Casa casa11 = new Casa("Carlos Quispe", true);
        Casa casa12 = new Casa("Ana Garcia", true);
        LDoble_Manzana listaManzana4 = new LDoble_Manzana();
        listaManzana4.adicion(casa10);
        listaManzana4.adicion(casa11);
        listaManzana4.adicion(casa12);

        Zona zona2 = new Zona("Villa Hermosa", "Miraflores", listaManzana3);
        zona2.adicionarManzana(listaManzana4);


        MultiCZona multiC1 = new MultiCZona();
        multiC1.adicionar(1, zona1);
        multiC1.adicionar(2, zona2);

        LSimple_Sucursal listaSuc1 = new LSimple_Sucursal();
        listaSuc1.adicion("Miraflores", 900);
        listaSuc1.adicion("Villa Fatima", 800);

        LDoble_Empresa listaEmp1 = new LDoble_Empresa();
        listaEmp1.adicion("Cascada", "Bebidas y Alimentos", listaSuc1);

        Represa represa1 = new Represa("Hampaturi", 400000);
        Represa represa2 = new Represa("Janko Khota", 600000);

        PilaRepresa pilaR1 = new PilaRepresa();
        pilaR1.adicionar(represa1);
        pilaR1.adicionar(represa2);

        Municipio municipio1 = new Municipio(multiC1,pilaR1,"LA PAZ", listaEmp1);
        municipio1.mostrar();

        Municipio municipio = new Municipio();
        municipio.leer();
        municipio.mostrar();
    }
}