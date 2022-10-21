package ExerciciosPOO.Pessoa;




import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Pessoa {
    private String name;
    private String dataNascimento;
    private float altura;

    public Pessoa() {
    }

    public void imprimirDados(String name, String dataNascimento, float altura, int idade){
        System.out.println(
                "O nome da pessoa é: " + name
                + "\nA pessoa nasceu na data: " + dataNascimento
                + "\nA altura da pessoa é: " + altura
                + "\nE sua idade é: " + idade);
    }

    public static int calcularIdade(String dataNascimento){
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date datanascInput = null;
        try{
            datanascInput = sdf.parse(dataNascimento);
        }catch (ParseException e){}

        Calendar dateOfBirth = new GregorianCalendar();
        dateOfBirth.setTime(datanascInput);

        Calendar today = Calendar.getInstance();

        int idade = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);
        dateOfBirth.add(Calendar.YEAR, idade);
        if (today.before(dateOfBirth)){
            idade--;
        }
        return idade;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }


}
