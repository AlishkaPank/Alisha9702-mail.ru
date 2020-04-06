package abstractFactory;

        import abstractFactory.concreteFactories.Elf_Army;
        import abstractFactory.concreteFactories.Ogr_Army;




public class Main {

    public static void main(String[] args){

        Army elf_Army = new Elf_Army();

        elf_Army.put(elf_Army.createCommander());

        for (int i = 0; i < 3; ++i) {
            elf_Army.put(elf_Army.createGeneral());
        }

        for (int i = 0; i < 300; ++i){
            elf_Army.put(elf_Army.createSoldier());
        }

        Army ogr_Army = new Ogr_Army();

        ogr_Army.put(ogr_Army.createCommander());

        for (int i = 0; i < 2; ++i) {
            ogr_Army.put(ogr_Army.createGeneral());
        }

        for (int i = 0; i < 25; ++i){
            ogr_Army.put(ogr_Army.createSoldier());
        }


        System.out.println( ((Elf_Army) elf_Army).get());
        System.out.println(((Ogr_Army) ogr_Army).get());
    }
}
