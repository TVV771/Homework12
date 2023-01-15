public class Main {
    public static void main(String[] args) {
     Author robertKiyosaki = new Author("Роберт", "Кийосаки");
     Author gregoryRoberts = new Author("Григорий", "Робертс");
        Book richDadpoorDad = new Book("Богатый папа, бедный папа",robertKiyosaki,1997);
        System.out.println(richDadpoorDad.getAuthor().getFullName());
        System.out.println(richDadpoorDad.getYear());
    }
}