        String[] Names = {"Vasya", "Petya", "Kolya", "Sasha", "Sergey"};

        String NameToFind = "Petya";

        for(int i = 0; i < Names.length; i++){

            if(Names[i].equalsIgnoreCase(NameToFind)){

                System.out.println("Name " + NameToFind + " found");
                break;
            }

        }
