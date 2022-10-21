package ExerciciosPOO.Data;

public class main {
    public static void main(String[] args) {
        Data data = new Data(38,5,2023);
        Data data2 = new Data(29, 5, 2023);
        data.dataCompleta(data);
        data.compararDatas(data2);
    }
}
