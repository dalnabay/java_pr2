package edu.mirea.pr2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Всеволод Андреев", "andreev@example.com", 'M');
        System.out.println("Автор до изменения почты:");
        System.out.println(author);

        author.setEmail("vsevolod.andreev@example.com");
        System.out.println("Имя: " + author.getName());
        System.out.println("Почта: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
        System.out.println("Автор после изменения почты:");
        System.out.println(author);
    }
}
