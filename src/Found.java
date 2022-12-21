public class Found {
    String name;
    String surname;
    String second_name;
    String INN;

    public int find(String[] massiv_name, String[] massiv_surname, String[] massiv_second_name, String[] massiv_UINN)  {//метод сравнивает введенную пользователем информацию и массивы в базе данных
        int t=0;
        for (int i = 1; i < massiv_name.length+1; i++) {
            if ((massiv_name[i-1].equals(this.name)) && (massiv_second_name[i-1].equals(this.second_name)) && (massiv_UINN[i-1].equals(this.INN)) && (massiv_surname[i-1].equals(this.surname))) {
                t=i;
            }
        }
        return t;
    }
    public void result(int number) throws MyException {
        if(number!=0) {
            System.out.println("В базе данных этот пользователь находится под номером " + number);
        }else{
            throw new MyException();
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getINN() {
        return INN;
    }

    public void setINN(String INN) {
        this.INN = INN;
    }

}