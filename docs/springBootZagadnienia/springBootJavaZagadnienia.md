# springBootJavaZagadnienia

-   [springBootJavaZagadnienia](#springbootjavazagadnienia)
    -   [Java](#java)
        -   [czym jest java streams (najważniejsze to znać .filter() .map() .findFirst() .toList())](#czym-jest-java-streams-najważniejsze-to-znać-filter-map-findfirst-tolist)
        -   [przetwarzanie sekwencyjne i równoległe](#przetwarzanie-sekwencyjne-i-równoległe)
        -   [czym jest pojo](#czym-jest-pojo)
        -   [czym są typy generyczne w java (malo ich używamy)](#czym-są-typy-generyczne-w-java-malo-ich-używamy)
        -   [czym jest clean code, zasady kiss, yagni, dry](#czym-jest-clean-code-zasady-kiss-yagni-dry)
        -   [czym jest java optional](#czym-jest-java-optional)
        -   [NullPointerException](#nullpointerexception)
        -   [czym jest ternary operator w java](#czym-jest-ternary-operator-w-java)
    -   [Spring](#spring)
        -   [adnotacja Autowired co to](#adnotacja-autowired-co-to)
        -   [adnotacja ComponentScan co to](#adnotacja-componentscan-co-to)
        -   [adnotacja Bean co to](#adnotacja-bean-co-to)
        -   [profile w spring (np development, production)](#profile-w-spring-np-development-production)
        -   [feign client co to](#feign-client-co-to)
        -   [adnotacja EntityScan co to](#adnotacja-entityscan-co-to)
        -   [czym jest programowanie aspektowe i jeden przykład wykorzystania](#czym-jest-programowanie-aspektowe-i-jeden-przykład-wykorzystania)
        -   [mapstruct](#mapstruct)
        -   [czym jest Slf4j](#czym-jest-slf4j)
        -   [czym jest DTO i po co sie stosuje](#czym-jest-dto-i-po-co-sie-stosuje)
        -   [czym jest ResponseEntity](#czym-jest-responseentity)
        -   [w jakim celu przydatna jest baza elasticsearch](#w-jakim-celu-przydatna-jest-baza-elasticsearch)
        -   [czym jest multitenancy](#czym-jest-multitenancy)
        -   [adnotacja @ConditionalOnProperty](#adnotacja-conditionalonproperty)
    -   [Hibernate](#hibernate)
        -   [czym jest method query, HQL](#czym-jest-method-query-hql)
        -   [adnotacja @EntityGraph - tylko do czego jest](#adnotacja-entitygraph---tylko-do-czego-jest)
        -   [problem bazodanowy N+1 czym on jest](#problem-bazodanowy-n1-czym-on-jest)
        -   [specyfikacja JPA czym jest](#specyfikacja-jpa-czym-jest)
        -   [podstawowe adnotacje hibernate z relacjami OneToMany](#podstawowe-adnotacje-hibernate-z-relacjami-onetomany)
        -   [czym jest fetchType](#czym-jest-fetchtype)
        -   [czym jest orphanRemoval](#czym-jest-orphanremoval)
        -   [baza H2 co to](#baza-h2-co-to)
        -   [czym jest adnotacja @Transactional](#czym-jest-adnotacja-transactional)
    -   [Bazy danych:](#bazy-danych)
        -   [powtórzyć podstawowe pojęcia bazodanowe (tabela, rekord, rodzaje relacji, indeks, klucz podst. obcy, constrainty)](#powtórzyć-podstawowe-pojęcia-bazodanowe-tabela-rekord-rodzaje-relacji-indeks-klucz-podst-obcy-constrainty)
        -   [Liquibase czym jest](#liquibase-czym-jest)
    -   [GIT](#git)
        -   [podstawowe pojęcia, branch, merge commit push pull](#podstawowe-pojęcia-branch-merge-commit-push-pull)
        -   [czym jest gitflow](#czym-jest-gitflow)
        -   [czym jest release oraz release candidate](#czym-jest-release-oraz-release-candidate)
    -   [Testy:](#testy)
        -   [co to jest test jednostkowy, asercje](#co-to-jest-test-jednostkowy-asercje)
        -   [co to jest mockito, co to given when then, czym jest mock, czym jest metoda verify w mockito](#co-to-jest-mockito-co-to-given-when-then-czym-jest-mock-czym-jest-metoda-verify-w-mockito)
        -   [czym są testy kontraktowe](#czym-są-testy-kontraktowe)
        -   [na czym polega TDD](#na-czym-polega-tdd)
    -   [Maven:](#maven)
        -   [w maven czym są sekcje dependency,build,plugin, scope provided](#w-maven-czym-są-sekcje-dependencybuildplugin-scope-provided)
        -   [czym są komendy maven: clean compile install](#czym-są-komendy-maven-clean-compile-install)
    -   [Bezpieczeństwo:](#bezpieczeństwo)
        -   [czym jest Keycloak (co to jest realm, uprawnienia)](#czym-jest-keycloak-co-to-jest-realm-uprawnienia)
        -   [czym jest token JWT](#czym-jest-token-jwt)
    -   [Architektura](#architektura)
        -   [czym jest CQRS (dodatkowo czym jest readmodel)](#czym-jest-cqrs-dodatkowo-czym-jest-readmodel)
        -   [czym są mikroserwisy (oraz podstawowe pojęcia: api gateway, load balancer, circuit breaker)](#czym-są-mikroserwisy-oraz-podstawowe-pojęcia-api-gateway-load-balancer-circuit-breaker)
        -   [czym jest replikacja w mikroserwisach i kafka (co to jest topic w kafka)](#czym-jest-replikacja-w-mikroserwisach-i-kafka-co-to-jest-topic-w-kafka)
        -   [czym jest wzorzec backend for frontend](#czym-jest-wzorzec-backend-for-frontend)
    -   [Inne:](#inne)
        -   [czym jest lombok i podstawowe adnotacje](#czym-jest-lombok-i-podstawowe-adnotacje)
        -   [kody http 200,201,204,400,401,403,409,422](#kody-http-200201204400401403409422)
        -   [czym jest specyfikacja OpenAPI](#czym-jest-specyfikacja-openapi)
        -   [zasady restful api - podstawowe](#zasady-restful-api---podstawowe)
        -   [czym jest amazon S3](#czym-jest-amazon-s3)
        -   [czym jest CI/CD](#czym-jest-cicd)
        -   [kim jest osoba - DevOps](#kim-jest-osoba---devops)
        -   [na czym polega scrum, daily, review, retro, planning](#na-czym-polega-scrum-daily-review-retro-planning)
        -   [czym jest owasp - tylko wiedzieć](#czym-jest-owasp---tylko-wiedzieć)
        -   [domain driven design - definicja](#domain-driven-design---definicja)
        -   [do czego używa sie postman](#do-czego-używa-sie-postman)
        -   [czym jest docker, dockerfile, docker compose](#czym-jest-docker-dockerfile-docker-compose)
        -   [sama definicja czym jest kubernetes (co to jest pod), kibana, grafana](#sama-definicja-czym-jest-kubernetes-co-to-jest-pod-kibana-grafana)

## Java

### czym jest java streams (najważniejsze to znać .filter() .map() .findFirst() .toList())

Java Streams to mechanizm wprowadzony w języku Java w wersji 8, który umożliwia operacje na strumieniach danych. Strumienie są sekwencją elementów, które można przetwarzać równolegle lub sekwencyjnie. Java Streams oferuje szereg operacji, które można łączyć w celu przetwarzania danych w bardziej funkcjonalny sposób.

Oto kilka najważniejszych operacji strumieniowych:

1. **`filter(Predicate<T> predicate)`**: Filtruje elementy na podstawie określonego warunku. Przyjmuje obiekt `Predicate`, który jest interfejsem funkcyjnym zawierającym metodę `test(T t)`.

    ```java
    List<String> listaSlow = Arrays.asList("jabłko", "banan", "gruszka", "wiśnia");
    List<String> owoceZaczynajaceSieNaB = listaSlow.stream()
                                                .filter(slowo -> slowo.startsWith("b"))
                                                .collect(Collectors.toList());
    ```

2. **`map(Function<T, R> mapper)`**: Transformuje każdy element strumienia przy użyciu określonej funkcji. Przyjmuje obiekt `Function`, który jest interfejsem funkcyjnym zawierającym metodę `apply(T t)`.

    ```java
    List<String> listaSlow = Arrays.asList("jabłko", "banan", "gruszka", "wiśnia");
    List<Integer> dlugosciOwocow = listaSlow.stream()
                                           .map(slowo -> slowo.length())
                                           .collect(Collectors.toList());
    ```

3. **`findFirst()`**: Zwraca pierwszy element strumienia. Jeśli strumień jest pusty, zwraca pustą wartość (Optional).

    ```java
    List<String> listaSlow = Arrays.asList("jabłko", "banan", "gruszka", "wiśnia");
    Optional<String> pierwszeOwoc = listaSlow.stream().findFirst();
    ```

4. **`toList()`**: Zbiera elementy strumienia do listy.

    ```java
    List<String> listaSlow = Arrays.asList("jabłko", "banan", "gruszka", "wiśnia");
    List<String> listaOwocow = listaSlow.stream().toList(); // Wymaga Java 16 lub nowszej
    // Alternatywnie można użyć: .collect(Collectors.toList())
    ```

Przykłady te ilustrują, jak można łączyć te operacje, tworząc bardziej skomplikowane i złożone przekształcenia danych przy użyciu strumieni w języku Java.

### przetwarzanie sekwencyjne i równoległe

Równoległe i sekwencyjne przetwarzanie odnosi się do sposobu, w jaki strumienie danych są przetwarzane w programie.

1. **Sekwencyjne przetwarzanie:**

    - Sekwencyjne przetwarzanie oznacza, że operacje na strumieniu danych są wykonywane w jednym wątku.
    - Każda operacja zaczyna się dopiero po zakończeniu poprzedniej.
    - Jest to tradycyjny, liniowy sposób przetwarzania danych.

    ```java
    List<String> listaSlow = Arrays.asList("jabłko", "banan", "gruszka", "wiśnia");

    // Sekwencyjne przetwarzanie
    long count = listaSlow.stream()
                          .filter(slowo -> slowo.startsWith("b"))
                          .count();
    ```

2. **Równoległe przetwarzanie:**

    - Równoległe przetwarzanie umożliwia wykorzystanie wielu wątków do przetwarzania danych.
    - Operacje są rozdzielane na różne wątki, co może przyspieszyć przetwarzanie, szczególnie w przypadku dużych zbiorów danych.
    - W przypadku strumieni równoległych, Java automatycznie zarządza podziałem danych i równoległym wykonaniem operacji.

    ```java
    List<String> listaSlow = Arrays.asList("jabłko", "banan", "gruszka", "wiśnia");

    // Równoległe przetwarzanie
    long countParallel = listaSlow.parallelStream()
                                 .filter(slowo -> slowo.startsWith("b"))
                                 .count();
    ```

W praktyce, decyzja o wyborze sekwencyjnego lub równoległego przetwarzania zależy od wielu czynników, takich jak rozmiar danych, złożoność operacji, dostępność zasobów sprzętowych itp. Równoległe przetwarzanie może przyspieszyć operacje dla dużych zbiorów danych, ale nie zawsze jest bardziej efektywne z punktu widzenia małych zbiorów lub prostych operacji. Ważne jest, aby zrozumieć kontekst swojej aplikacji i dostosować podejście do konkretnej sytuacji.

### czym jest pojo

POJO, czyli Plain Old Java Object, to po prostu zwykły obiekt w języku Java, który nie jest związany z żadnymi specjalnymi frameworkami czy technologiami. Jest to klasa, która zawiera jedynie prywatne pola, metody dostępowe (gettery i settery) oraz ewentualnie konstruktory.

Przykład prostego POJO w języku Java:

```java
public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    // Konstruktor, gettery, settery

    // Przykładowy konstruktor
    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    // Gettery i settery
    // ...
}
```

W tym przykładzie `Osoba` to klasa POJO. Ma ona prywatne pola (`imie`, `nazwisko`, `wiek`), konstruktor, gettery i settery. To wszystko. Klasy tego typu są proste, czytelne i niezależne od zastosowania w konkretnych technologiach czy frameworkach.

POJO jest często używane w różnych kontekstach, takich jak mapowanie obiektowo-relacyjne w technologiach ORM (np. Hibernate), wstrzykiwanie zależności w kontenerach IoC (np. Spring), czy w innych przypadkach, gdzie potrzebujemy prostych i zrozumiałych obiektów.

### czym są typy generyczne w java (malo ich używamy)

Typy generyczne w języku Java pozwalają na stworzenie klas, interfejsów i metod, które są ogólniejsze i bardziej elastyczne, ponieważ mogą działać z różnymi typami danych. Pozwalają programistom na utworzenie kodu, który jest bardziej generyczny, co przyczynia się do większej elastyczności i bezpieczeństwa typów.

Oto kilka kluczowych pojęć związanych z typami generycznymi w Java:

1. **Klasa Generyczna:**

    - Klasa, która może działać na różnych typach danych, jest oznaczona jako generyczna poprzez dodanie parametru typu w trójkątne nawiasy ostry (< >).
    - Przykład:

        ```java
        public class Box<T> {
            private T zawartosc;

            public void dodajZawartosc(T zawartosc) {
                this.zawartosc = zawartosc;
            }

            public T pobierzZawartosc() {
                return zawartosc;
            }
        }
        ```

2. **Metoda Generyczna:**

    - Metoda, która może działać na różnych typach danych, również może być generyczna.
    - Parametry generyczne są wprowadzane przed zwracanym typem.

        ```java
        public <T> T znajdzPierwszy(List<T> lista) {
            if (lista != null && !lista.isEmpty()) {
                return lista.get(0);
            }
            return null;
        }
        ```

3. **Interfejs Generyczny:**

    - Interfejs może również być generyczny, co pozwala na elastyczne implementacje z różnymi typami danych.

        ```java
        public interface Para<K, V> {
            K getPierwszy();
            V getDrugi();
        }
        ```

4. **Ograniczenia Typów (Bounds):**

    - Można narzucić ograniczenia na typy, które mogą być używane jako argumenty generyczne.
    - Na przykład, ograniczenie do klas dziedziczących po konkretnej klasie lub implementujących dany interfejs.

        ```java
        public class Magazyn<T extends Produkt> {
            // ...
        }
        ```

5. **Wildcards (Znaki wieloznaczne):**

    - Możliwość używania znaków wieloznacznych, takich jak `?`, do reprezentowania nieokreślonych typów.

        ```java
        public void drukujListe(List<?> lista) {
            for (Object element : lista) {
                System.out.println(element);
            }
        }
        ```

Dzięki tym mechanizmom, typy generyczne w Java pozwalają na bardziej elastyczne i bezpieczne programowanie, eliminując potrzebę rzutowania (casting) i umożliwiając tworzenie bardziej uniwersalnych struktur danych i algorytmów.

### czym jest clean code, zasady kiss, yagni, dry

"Clean Code" to koncepcja i praktyka pisania kodu źródłowego w sposób, który jest czytelny, zrozumiały, utrzymany, efektywny i łatwo rozszerzalny. Jest to podejście do programowania, które promuje dobre praktyki i zasady projektowe, aby zminimalizować złożoność kodu oraz ułatwić jego zrozumienie i utrzymanie.

Oto kilka zasad i zaleceń związanych z "Clean Code" oraz innymi zasadami programowania:

1. **Zasada KISS (Keep It Simple, Stupid):**

    - Stosuj jak najprostsze rozwiązania, unikaj nadmiernego skomplikowania.
    - Unikaj zbyt złożonych struktur i algorytmów, jeżeli prostsze spełniają wymagania.

2. **Zasada YAGNI (You Ain't Gonna Need It):**

    - Nie dodawaj kodu, który nie jest obecnie potrzebny.
    - Unikaj dodawania zbędnej funkcjonalności na podstawie przypuszczeń o tym, że może być potrzebna w przyszłości.

3. **Zasada DRY (Don't Repeat Yourself):**

    - Unikaj powtarzania kodu. Jeżeli masz fragment kodu, który wykonuje pewne zadanie, nie kopiuj go, ale przenieś go do funkcji, klasy lub modułu, aby można było go używać wielokrotnie.

4. **Zasada SOLID:**
    - SOLID to zestaw zasad projektowania obiektowego, które promują elastyczność, łatwość rozszerzania i utrzymania kodu.
        - S (Single Responsibility Principle): Każda klasa powinna mieć jedną, i tylko jedną, odpowiedzialność.
        - O (Open/Closed Principle): Klasa powinna być otwarta na rozszerzanie, ale zamknięta na modyfikacje.
        - L (Liskov Substitution Principle): Obiekty danej klasy powinny być w stanie zastąpić obiekty klasy bazowej bez zmiany właściwości programu.
        - I (Interface Segregation Principle): Klienci nie powinni być zmuszani do implementacji interfejsów, których nie używają.
        - D (Dependency Inversion Principle): Moduły wysokiego poziomu nie powinny zależeć od modułów niskiego poziomu. Oba powinny zależeć od abstrakcji.

Pisanie "czystego kodu" i przestrzeganie tych zasad przyczynia się do lepszej jakości kodu, łatwiejszego utrzymania, mniej błędów oraz bardziej efektywnego procesu rozwoju oprogramowania.

### czym jest java optional

`Optional` to klasa wprowadzona w języku Java 8, która reprezentuje pojęcie, że wartość może być obecna lub nieobecna. Jest to sposób na radzenie sobie z przypadkami, w których metoda może zwrócić wartość `null`, co może prowadzić do błędów związanych z NullPointerException.

`Optional` jest projektowany w taki sposób, aby zmuszać programistów do bardziej świadomego podejścia do obsługi możliwych braków wartości. Oto kilka kluczowych cech `Optional`:

1. **Tworzenie Optional:**

    - Można utworzyć obiekt `Optional` za pomocą statycznej metody `of`, jeżeli wartość nie jest `null`, lub za pomocą `ofNullable`, jeżeli wartość może być `null`.

    ```java
    Optional<String> optionalWithValue = Optional.of("Wartość");
    Optional<String> optionalNullable = Optional.ofNullable(null);
    ```

2. **Sprawdzanie Czy Wartość Jest Obecna:**

    - Metoda `isPresent()` zwraca `true`, jeśli wartość istnieje, a `false`, jeśli jest `null`.

    ```java
    if (optionalWithValue.isPresent()) {
        // Wartość istnieje
    }
    ```

3. **Pobieranie Wartości:**

    - Metoda `get()` zwraca wartość, jeśli istnieje. Jednak jest to operacja ryzykowna, ponieważ może spowodować `NoSuchElementException`, jeśli wartość jest `null`.

    ```java
    String value = optionalWithValue.get();
    ```

4. **Obsługa Braku Wartości:**

    - Metoda `orElse(defaultValue)` zwraca wartość, jeśli istnieje, lub domyślną wartość, jeśli nie.
    - Metoda `orElseGet(Supplier<? extends T> other)` działa podobnie, ale przyjmuje funkcję dostarczającą domyślną wartość.
    - Metoda `orElseThrow(Supplier<? extends X> exceptionSupplier)` rzuca wyjątek, jeśli wartość nie istnieje.

    ```java
    String result = optionalWithValue.orElse("Domyślna wartość");
    ```

5. **Operacje na Wartości:**
    - Metoda `map` pozwala na przekształcenie wartości, jeśli istnieje.
    - Metoda `filter` pozwala na sprawdzenie wartości zgodnie z pewnym warunkiem.
    ```java
    Optional<Integer> length = optionalWithValue.map(String::length);
    Optional<String> filtered = optionalWithValue.filter(s -> s.startsWith("W"));
    ```

`Optional` jest używane w sytuacjach, gdzie zwracanie `null` może prowadzić do problemów, a jednocześnie pomaga programiście jasno wyrazić intencję, że wartość może być nieobecna. Warto jednak używać go umiarkowanie i pamiętać, że nadużywanie `Optional` może prowadzić do nadmiernego skomplikowania kodu. W niektórych przypadkach zwykła wartość `null` lub inne strategie obsługi braku wartości mogą być równie czytelne i skuteczne.

### NullPointerException

`NullPointerException` (NPE) to rodzaj wyjątku (exception) w języku Java. Ten wyjątek jest rzucany, gdy program próbuje odwołać się do obiektu, który jest równy `null`, ale wymaga dostępu do jego metod lub pól. W innych słowach, programista próbuje wykonać operację na obiekcie, który nie został jeszcze zainicjowany (czyli ma wartość `null`).

Przykłady sytuacji, w których może wystąpić `NullPointerException`:

1. **Odwoływanie się do metody lub pola obiektu `null`:**

    ```java
    String tekst = null;
    int dlugosc = tekst.length(); // To spowoduje NullPointerException, ponieważ "tekst" jest null.
    ```

2. **Próba dostępu do elementu tablicy, który jest `null`:**

    ```java
    int[] tablica = null;
    int element = tablica[0]; // To spowoduje NullPointerException, ponieważ "tablica" jest null.
    ```

3. **Wywoływanie metody na obiekcie, który jest `null`:**

    ```java
    Obiekt obiekt = null;
    obiekt.metoda(); // To spowoduje NullPointerException, ponieważ "obiekt" jest null.
    ```

4. **Błąd przy rzutowaniu typów na `null`:**
    ```java
    String napis = (String) null;
    int dlugosc = napis.length(); // To spowoduje NullPointerException przy rzucie "null" na "String".
    ```

Ważne jest, aby być ostrożnym i sprawdzać, czy referencje do obiektów nie są równe `null`, zanim zostaną użyte. Można to zrobić za pomocą warunków logicznych, takich jak instrukcje `if`, albo poprzez korzystanie z `Optional` (jak wcześniej omawiano) w miejscach, gdzie wartości mogą być nieobecne. Unikanie sytuacji, w których `null` może prowadzić do błędów, to często jedno z kluczowych zagadnień w programowaniu w języku Java.

### czym jest ternary operator w java

W języku Java, ternary operator to skrócony zapis warunkowego operatora trójkowego, który pozwala na zwięzłe napisanie wyrażeń warunkowych. Operator ten składa się z trzech elementów: warunku, wartości zwracanej w przypadku spełnienia warunku (jeśli jest prawdziwy), oraz wartości zwracanej w przypadku niespełnienia warunku (jeśli jest fałszywy).

Składnia ternary operatora wygląda następująco:

```
warunek ? wartoscGdyPrawda : wartoscGdyFalsz;
```

Przykłady użycia ternary operatora:

```java
int x = 10;
int y = 20;

// Przykład 1: Przypisanie wartości do zmiennej w zależności od warunku
int wynik = (x > y) ? x : y;

// Przykład 2: Wydrukowanie wartości w zależności od warunku
System.out.println((x > y) ? "x jest większe" : "y jest większe");

// Przykład 3: Zastosowanie w instrukcji warunkowej
String komunikat = (x > y) ? "x jest większe" : "y jest większe";
System.out.println(komunikat);
```

W przykładzie 1, zmienna `wynik` otrzymuje wartość `x`, jeśli warunek `(x > y)` jest prawdziwy, a w przeciwnym razie otrzymuje wartość `y`.

W przykładzie 2, operator ternary jest używany bezpośrednio wewnątrz metody `println` do wydrukowania różnych komunikatów w zależności od warunku.

W przykładzie 3, wartość ternary operatora jest przypisywana do zmiennej `komunikat`, a następnie ta zmienna jest wydrukowana.

Ternary operator jest przydatny, gdy chcemy zwięźle wyrazić proste warunki, ale należy go stosować z umiarem, aby unikać utraty czytelności w bardziej skomplikowanych warunkach.

## Spring

### adnotacja Autowired co to

Służy do automatycznego wstrzykiwania zależności.

Korzystanie z `@Autowired`

Po włączeniu wstrzykiwania adnotacji możemy zastosować automatyczne łączenie `właściwości`, `ustawiaczy` i `konstruktorów`.

1. `@Autowired` we właściwościach
   Zobaczmy, jak możemy dodać adnotację do właściwości za pomocą `@Autowired`. Eliminuje to potrzebę stosowania `getterów` i `setterów`.

    Najpierw zdefiniujmy komponent `fooFormatter`:

    ```java
    @Component("fooFormatter")
    public class FooFormatter {
        public String format() {
            return "foo";
        }
    }
    ```

    Następnie wstrzykniemy ten komponent bean do komponentu `FooService`, używając `@Autowired` w definicji pola:

    ```java
    @Component
    public class FooService {
        @Autowired
        private FooFormatter fooFormatter;
    }
    ```

    W rezultacie Spring wstrzykuje `fooFormatter` podczas tworzenia `FooService`.

2. `@Autowired` na seterach
   Teraz spróbujmy dodać adnotację `@Autowired` do metody ustawiającej.

    W poniższym przykładzie metoda ustawiająca jest wywoływana z instancją `FooFormatter` podczas tworzenia `FooService`:

    ```java
    public class FooService {
        private FooFormatter fooFormatter;
        @Autowired
        public void setFormatter(FooFormatter fooFormatter) {
            this.fooFormatter = fooFormatter;
        }
    }
    ```

3. `@Autowired` w konstruktorach
   Na koniec użyjmy @Autowired na konstruktorze.

    Zobaczymy, że Spring wstrzykuje instancję `FooFormatter` jako argument konstruktora `FooService`:

    ```java
        public class FooService {
        private FooFormatter fooFormatter;
        @Autowired
        public void setFormatter(FooFormatter fooFormatter) {
            this.fooFormatter = fooFormatter;
        }
    }
    ```

### adnotacja ComponentScan co to

Adnotacja `@ComponentScan` w Springu jest używana do wskazania kontenerowi Springa, gdzie powinien szukać komponentów, serwisów, repozytoriów itp.
W skrócie, umożliwia ona skanowanie pakietów w poszukiwaniu klas, które mają być zarządzane przez kontener Springa jako komponenty.

Główne zastosowanie `@ComponentScan` to automatyczne skanowanie pakietów w celu odnalezienia i zarejestrowania klas oznaczonych adnotacjami takimi jak `@Component`, `@Service`, `@Repository` lub `@Controller`.

Przykład użycia `@ComponentScan` można zobaczyć w konfiguracji klasy głównej aplikacji Spring:

```java
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfig {
    // Dodatkowe konfiguracje...
}
```

W powyższym przykładzie, `@ComponentScan` wskazuje, że Spring powinien skanować pakiet o nazwie "com.example" (i jego podpakiety) w celu znalezienia komponentów, które będą zarządzane przez kontener. Jeżeli w tym pakiecie znajdą się klasy oznaczone adnotacjami jak `@Component`, `@Service`, `@Repository`, itp., to zostaną automatycznie zarejestrowane w kontenerze Springa.

`@ComponentScan` można również dostosować do skanowania konkretnych klas, interfejsów lub adnotacji, a także można kontrolować, jakie filtry będą używane podczas skanowania komponentów.

Podsumowując, `@ComponentScan` ułatwia automatyczne skanowanie pakietów w poszukiwaniu komponentów, eliminując potrzebę ręcznej rejestracji każdej klasy w kontenerze Springa.

### adnotacja Bean co to

W Spring Boot adnotacja `@Bean` jest używana do oznaczania metod, które zwracają obiekty, które Spring ma zarządzać jako beany w kontenerze IoC (Inversion of Control). Beany są obiektami, które są zarządzane przez kontener IoC, co oznacza, że Spring jest odpowiedzialny za ich tworzenie, konfigurację i dostarczanie.

Główne zastosowania adnotacji `@Bean` obejmują:

1. **Definiowanie beanów:** Można oznaczyć metodę zwracającą obiekt jako bean poprzez dodanie adnotacji `@Bean` do tej metody. Spring traktuje wynik tej metody jako obiekt zarządzany, który może być później używany w kontekście aplikacji.

    ```java
    @Configuration
    public class AppConfig {

        @Bean
        public SomeBean someBean() {
            return new SomeBean();
        }
    }
    ```

2. **Konfiguracja dodatkowych opcji:** Adnotacja `@Bean` umożliwia dodawanie dodatkowych opcji konfiguracyjnych poprzez dostarczanie atrybutów. Na przykład, można skonfigurować zasięg beana, inicjalizację opóźnioną (lazy initialization) itp.

    ```java
    @Bean(initMethod = "init", destroyMethod = "cleanup")
    public SomeBean someBean() {
        return new SomeBean();
    }
    ```

3. **Wstrzykiwanie zależności:** Beany mogą być wstrzykiwane jako zależności w inne beany. Spring automatycznie zarządza wstrzykiwaniem tych zależności.

    ```java
    @Configuration
    public class AppConfig {

        @Bean
        public SomeBean someBean() {
            return new SomeBean();
        }

        @Bean
        public AnotherBean anotherBean(SomeBean someBean) {
            return new AnotherBean(someBean);
        }
    }
    ```

W przykładowym kodzie powyżej, `SomeBean` i `AnotherBean` są beanami zarządzanymi przez Spring, a `AnotherBean` wstrzykuje `SomeBean` jako zależność.

Podsumowując, adnotacja `@Bean` jest używana w Spring Boot do definiowania i konfiguracji beanów w kontenerze IoC, co umożliwia Springowi skonfigurowanie i zarządzanie obiektami w aplikacji.

### profile w spring (np development, production)

W Spring Framework, profile to sposób konfiguracji aplikacji, który pozwala na dostosowanie zachowania aplikacji do różnych środowisk lub sytuacji. Profile pozwalają na definiowanie różnych konfiguracji dla różnych etapów cyklu życia aplikacji, takich jak development, test, production, itp. Spring Boot, będąc rozwinięciem Spring Framework, dostarcza wygodnych mechanizmów obsługi profili.

Aby używać profili w Spring Boot, możesz skorzystać z adnotacji `@Profile` na klasie konfiguracyjnej, komponencie lub metodzie bean. Poniżej znajdują się przykłady wykorzystania profili w Spring Boot:

1. **Adnotacja @Profile na klasie konfiguracyjnej:**

    ```java
    @Configuration
    @Profile("development")
    public class DevelopmentConfig {
        // Konfiguracja specyficzna dla środowiska development
    }

    @Configuration
    @Profile("production")
    public class ProductionConfig {
        // Konfiguracja specyficzna dla środowiska production
    }
    ```

2. **Adnotacja @Profile na poziomie metody @Bean:**

    ```java
    @Configuration
    public class AppConfig {

        @Bean
        @Profile("development")
        public SomeBean developmentBean() {
            return new DevelopmentBean();
        }

        @Bean
        @Profile("production")
        public SomeBean productionBean() {
            return new ProductionBean();
        }
    }
    ```

3. **Ustawienia profili w pliku application.properties lub application.yml:**

    W pliku konfiguracyjnym możesz zdefiniować aktywne profile za pomocą właściwości `spring.profiles.active`:

    ```properties
    spring.profiles.active=development
    ```

    lub w formie YAML:

    ```yaml
    spring:
        profiles:
            active: development
    ```

W wyniku powyższych ustawień, Spring Boot włączy tylko beany i konfiguracje przypisane do aktywnego profilu. Możesz używać różnych profili w zależności od środowiska (development, production, test) lub innych kryteriów, które są dla Ciebie istotne.

Przy uruchamianiu aplikacji Spring Boot, możesz także aktywować profile za pomocą argumentów wiersza poleceń, np. `--spring.profiles.active=development`.

### feign client co to

Feign to deklaratywny klient HTTP stworzony przez Netflix, który ułatwia komunikację między mikrousługami w architekturze opartej na mikrousługach. Feign jest często używany w połączeniu z Eureką (komponentem do dynamicznego odnajdywania i rejestrowania usług) w środowisku Spring Cloud.

Feign Client w Spring Boot to specjalny rodzaj klienta HTTP dostępny w Spring Cloud, który upraszcza tworzenie klientów do zdalnych usług (mikrousług). W przypadku Feign, interakcje z usługami są opisane za pomocą interfejsów i adnotacji, co pozwala na bardziej deklaratywne podejście do komunikacji zdalnej.

Oto przykład prostej konfiguracji Feign Client w Spring Boot:

```java
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "example-service", url = "http://example-service-api")
public interface ExampleFeignClient {

    @GetMapping("/api/resource")
    String getResource();
}
```

W tym przykładzie:

-   `@FeignClient` to adnotacja, która oznacza interfejs jako Feign Client.
-   `name` to unikalna nazwa klienta Feign, która może być używana w kontekście Spring do odnajdywania klienta.
-   `url` to adres URL docelowej usługi, z którą Feign będzie komunikować się.
-   `ExampleFeignClient` to interfejs z metodą `getResource`, która jest zdalnym wywołaniem do usługi o nazwie "example-service".

Kiedy używasz Feign, Spring Boot zajmuje się generowaniem klienta i obsługą komunikacji HTTP. Możesz wstrzykiwać Feign Client jako zależność do swoich komponentów i używać go do wykonywania zdalnych wywołań usług. Jest to wygodny sposób na abstrahowanie detali implementacyjnych komunikacji zdalnej i umożliwianie bardziej deklaratywnego podejścia do komunikacji między mikrousługami.

### adnotacja EntityScan co to

W kontekście aplikacji opartej na Spring i korzystającej z JPA (Java Persistence API) do komunikacji z bazą danych, klasy encji reprezentują obiekty, które są przechowywane w bazie danych. Są to takie obiekty, które chcemy mapować na rekordy w tabelach bazy danych.

Adnotacja `@EntityScan` informuje Spring, gdzie ma szukać tych klas encji. Gdy używasz JPA, konieczne jest, aby Spring wiedział, gdzie znajdują się te klasy, aby mógł je zidentyfikować i uwzględnić w procesie zarządzania danymi w bazie danych.

Przykładowo, jeśli twoje klasy encji znajdują się w pakiecie `com.example.domain`, a twoja konfiguracja JPA jest osobnym plikiem, możesz użyć `@EntityScan`, aby poinformować Spring, żeby szukał klas encji w tym konkretnym pakiecie.

```java
@Configuration
@EntityScan(basePackages = "com.example.domain")
public class JpaConfig {
    // Konfiguracja JPA
}
```

Ta adnotacja jest szczególnie użyteczna w sytuacji, gdy klasy encji nie są umieszczone w standardowym miejscu, które Spring automatycznie skanuje w poszukiwaniu komponentów.

Warto jednak zaznaczyć, że w wielu przypadkach, szczególnie przy korzystaniu z Spring Boot, nie musisz ręcznie konfigurować `@EntityScan`, ponieważ Spring Boot domyślnie skanuje katalogi pakietów w poszukiwaniu klas encji, zwłaszcza tam, gdzie znajduje się klasa główna aplikacji oznaczona adnotacją `@SpringBootApplication`.

### czym jest programowanie aspektowe i jeden przykład wykorzystania

Programowanie aspektowe (ang. Aspect-Oriented Programming, AOP) to paradygmat programowania, który ma na celu ułatwienie separacji różnych obszarów zainteresowań w kodzie źródłowym. Główną ideą AOP jest oddzielenie kodu odpowiedzialnego za pewne funkcjonalności od kodu, który implementuje główne funkcjonalności aplikacji. W AOP, te "skrzydła" funkcjonalności są nazywane aspektami.

Aspekty pozwalają na wprowadzenie funkcjonalności, takiej jak logowanie, transakcje, zabezpieczenia czy pomiar wydajności, bez konieczności wprowadzania ich bezpośrednio w kodzie głównej funkcjonalności. W AOP definiuje się punkty przecięcia (ang. join points), czyli miejsca, w których aspekt może być wykonany, oraz rady (ang. advice), czyli kod, który jest wykonywany w danym punkcie przecięcia.

Przykład użycia programowania aspektowego w Spring Framework:

1. **Definicja aspektu:**

    ```java
    import org.aspectj.lang.annotation.Aspect;
    import org.aspectj.lang.annotation.Before;
    import org.springframework.stereotype.Component;

    @Aspect
    @Component
    public class LoggingAspect {

        @Before("execution(* com.example.service.*.*(..))")
        public void logBeforeServiceMethodExecution() {
            System.out.println("Log: Method from com.example.service package is about to be executed.");
        }
    }
    ```

    W tym przykładzie `LoggingAspect` jest aspektem, który definiuje radę (`@Before`) dla punktu przecięcia, który obejmuje wywołania wszystkich metod w pakiecie `com.example.service`.

2. **Kod głównej funkcjonalności:**

    ```java
    import org.springframework.stereotype.Service;

    @Service
    public class ExampleService {

        public void performTask() {
            System.out.println("Executing the main task.");
        }
    }
    ```

    Klasa `ExampleService` to klasa reprezentująca główną funkcjonalność.

3. **Konfiguracja Spring:**

    ```java
    import org.springframework.context.annotation.ComponentScan;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.context.annotation.EnableAspectJAutoProxy;

    @Configuration
    @ComponentScan("com.example")
    @EnableAspectJAutoProxy
    public class AppConfig {
        // Konfiguracja Spring
    }
    ```

    Adnotacja `@EnableAspectJAutoProxy` informuje Spring, żeby włączył wsparcie dla aspektów.

W efekcie, gdy zostanie wywołana metoda `performTask` z klasy `ExampleService`, aspekt `LoggingAspect` wykona kod zdefiniowany w radzie `logBeforeServiceMethodExecution`, wyświetlając odpowiedni komunikat na konsoli przed wykonaniem głównej funkcjonalności.

Programowanie aspektowe jest szczególnie przydatne w sytuacjach, gdzie pewne funkcjonalności są wspólne dla wielu miejsc w kodzie, a ich wydzielenie do osobnych aspektów pomaga w utrzymaniu, testowaniu i zrozumieniu kodu.

### mapstruct

MapStruct to biblioteka generowania kodu w języku Java, która ułatwia implementację mapowań pomiędzy typami obiektów. Generuje kod mapowania w czasie kompilacji na podstawie adnotacji w kodzie, eliminując konieczność ręcznego pisania rutynowego kodu. MapStruct ma na celu ułatwienie procesu mapowania między obiektami, sprawiając, że jest łatwy, wydajny i bezpieczny typowo.

Oto kilka kluczowych cech MapStruct:

1. **Generowanie Kodu w Czasie Kompilacji:** MapStruct generuje wydajny kod mapowania w czasie kompilacji, co poprawia wydajność w porównaniu do rozwiązań opartych na refleksji w czasie wykonania.

2. **Konfiguracja za pomocą Adnotacji:** Do definiowania mapowania między beanami używa się adnotacji, określając relacje między polami lub metodami.

3. **Bezpieczne Pod względem Typów Mapowania:** MapStruct generuje bezpieczny pod względem typów kod mapowania, co zmniejsza ryzyko błędów w czasie wykonania związanych z niezgodnościami w właściwościach beanów.

4. **Obsługa Konwerterów Niestandardowych:** MapStruct umożliwia definiowanie konwerterów niestandardowych dla określonych typów lub scenariuszy, co daje elastyczność w procesie mapowania.

5. **Integracja z Środowiskiem Programistycznym:** MapStruct jest często dobrze zintegrowany z popularnymi środowiskami programistycznymi Java, oferując funkcje takie jak uzupełnianie kodu, nawigacja i sprawdzanie błędów.

Poniżej znajduje się prosty przykład działania MapStruct:

```java
// Bean źródłowy
public class Źródło {
    private String imię;
    private int wiek;

    // Gettery i settery
}

// Bean docelowy
public class Cel {
    private String pełneImię;
    private int lata;

    // Gettery i settery
}

// Interfejs mapujący
@Mapper
public interface MójMapper {
    MójMapper INSTANCJA = Mappers.getMapper(MójMapper.class);

    @Mapping(source = "imię", target = "pełneImię")
    @Mapping(source = "wiek", target = "lata")
    Cel mapujNaCel(Źródło źródło);
}

// Użycie
Źródło źródło = new Źródło("Jan", 25);
Cel cel = MójMapper.INSTANCJA.mapujNaCel(źródło);
```

W tym przykładzie MapStruct generuje kod mapowania na podstawie adnotacji w interfejsie `MójMapper`. Metoda `mapujNaCel` mapuje obiekt typu `Źródło` na obiekt typu `Cel`, zmieniając nazwy i konwertując właściwości zgodnie z określonymi regułami.

### czym jest Slf4j

SLF4J (Simple Logging Facade for Java) to prosty fasadowy interfejs do logowania w języku Java. Jest to narzędzie, które umożliwia programistom korzystanie z różnych systemów logowania, jednocześnie zapewniając jednolity interfejs dla aplikacji. SLF4J nie dostarcza implementacji samego logowania; zamiast tego pozwala na podłączanie różnych frameworków logowania (np. Logback, Log4j, Java Util Logging) i korzystanie z nich w spójny sposób.

Oto kilka kluczowych cech SLF4J:

1. **Fasadowy Interfejs:** SLF4J dostarcza prosty interfejs (fasadę), który pozwala programistom korzystać z różnych frameworków logowania, niezależnie od tego, który jest dostępny w danym środowisku.

2. **Zapewnia Jednolity Interfejs:** Dzięki SLF4J, kod aplikacji korzystający z logowania nie jest bezpośrednio zależny od konkretnego frameworku logowania. Programista może zmienić implementację logowania bez zmiany kodu aplikacji.

3. **Wsparcie dla Parametryzowanych Komunikatów:** SLF4J oferuje wsparcie dla parametryzowanych komunikatów logowania, co pozwala na efektywne zarządzanie konstrukcją komunikatów w celu zwiększenia wydajności.

4. **Dostosowywalność:** Programista może dostosować implementację logowania, wybierając odpowiednią implementację fasady i backendu logowania w zależności od potrzeb.

Przykład użycia SLF4J w kodzie Java może wyglądać tak:

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MojaKlasa {
    private static final Logger logger = LoggerFactory.getLogger(MojaKlasa.class);

    public void metoda() {
        // Przykład logowania
        logger.debug("To jest wiadomość debug");
        logger.info("To jest wiadomość informacyjna");
        logger.error("To jest wiadomość błędu");
    }
}
```

W powyższym przykładzie `LoggerFactory.getLogger(MojaKlasa.class)` uzyskuje instancję loggera dla danej klasy, a następnie można korzystać z różnych poziomów logowania, takich jak `debug`, `info` i `error`. Implementację logowania można dostosować, dodając odpowiednią zależność, na przykład Logback czy Log4j.

### czym jest DTO i po co sie stosuje

DTO, czyli Data Transfer Object, to wzorzec projektowy wykorzystywany w programowaniu, szczególnie w kontekście aplikacji wielowarstwowych, aby efektywnie przesyłać dane między różnymi komponentami systemu. DTO to obiekt, który służy jedynie do przenoszenia danych między warstwami, a nie zawiera logiki biznesowej.

Główne cele stosowania DTO to:

1. **Zmniejszenie ilości przesyłanych danych:** DTO pozwala na przesyłanie tylko tych informacji, które są niezbędne, eliminując konieczność przesyłania całych obiektów z warstwy do warstwy.

2. **Separacja Interfejsu od Implementacji:** Warstwy aplikacji często komunikują się ze sobą poprzez interfejsy. DTO pomaga oddzielić te interfejsy od implementacji, umożliwiając łatwe wprowadzanie zmian w jednej warstwie bez konieczności modyfikacji drugiej.

3. **Ułatwienie Zgodności między Interfejsami:** W przypadku aplikacji, które korzystają z różnych technologii lub są rozproszone, stosowanie DTO ułatwia zgodność interfejsów, ponieważ definiuje jednolity sposób przesyłania danych.

4. **Optymalizacja Wydajności:** Przesyłanie tylko niezbędnych danych może zredukować ilość ruchu sieciowego i poprawić wydajność aplikacji, zwłaszcza w przypadku komunikacji między klientem a serwerem.

Przykład prostego DTO w języku Java może wyglądać tak:

```java
public class UserDTO {
    private String username;
    private String email;

    // Konstruktory, gettery, settery
}
```

Załóżmy, że mamy klasę użytkownika w warstwie biznesowej:

```java
public class User {
    private String username;
    private String password;
    private String email;

    // Konstruktory, gettery, settery
}
```

Gdy przekazujemy dane użytkownika z warstwy biznesowej do warstwy prezentacji, moglibyśmy użyć obiektu UserDTO, aby przesłać tylko te informacje, które są potrzebne w warstwie prezentacji (na przykład, aby ukryć hasło).

W skrócie, DTO jest używane do efektywnego przesyłania danych pomiędzy warstwami aplikacji, pomagając w zwiększeniu elastyczności, separacji i wydajności systemu.

### czym jest ResponseEntity

`ResponseEntity` to klasa w frameworku Spring, używana do reprezentowania pełnej odpowiedzi HTTP, zawierającej zarówno ciało odpowiedzi, nagłówki, jak i kod stanu HTTP. Jest często stosowana w obszarze budowania aplikacji webowych, szczególnie w przypadku RESTful API, gdzie pełna kontrola nad odpowiedzią HTTP jest istotna.

Oto kilka kluczowych cech i zastosowań klasy `ResponseEntity` w Spring:

1. **Zawartość Odpowiedzi:**

    - `ResponseEntity` umożliwia ustawienie ciała odpowiedzi. Może to być dowolny obiekt reprezentujący dane, które mają być przesłane jako odpowiedź.

    ```java
    ResponseEntity<String> responseEntity = new ResponseEntity<>("Treść odpowiedzi", HttpStatus.OK);
    ```

2. **Kod Stanu HTTP:**

    - Pozwala na ustawienie kodu stanu HTTP, który zostanie przekazany w odpowiedzi. Na przykład, `HttpStatus.OK` oznacza sukces, `HttpStatus.NOT_FOUND` oznacza, że zasób nie został znaleziony, itp.

    ```java
    ResponseEntity<String> responseEntity = new ResponseEntity<>("Not Found", HttpStatus.NOT_FOUND);
    ```

3. **Nagłówki HTTP:**

    - Można również dostosować nagłówki HTTP, dodając je do `ResponseEntity`. Na przykład, możesz ustawić nagłówek typu zawartości, nagłówek niestandardowy itp.

    ```java
    HttpHeaders headers = new HttpHeaders();
    headers.add("Custom-Header", "Wartość niestandardowego nagłówka");
    ResponseEntity<String> responseEntity = new ResponseEntity<>("Treść odpowiedzi", headers, HttpStatus.OK);
    ```

4. **Obsługa Błędów:**

    - `ResponseEntity` jest również używane do obsługi błędów. Na przykład, w przypadku wyjątków, można zwrócić `ResponseEntity` z odpowiednim kodem stanu HTTP i informacją o błędzie.

    ```java
    ResponseEntity<String> responseEntity = new ResponseEntity<>("Błąd: Zasób nieznaleziony", HttpStatus.NOT_FOUND);
    ```

5. **Generyczność:**

    - `ResponseEntity` jest generyczna, co oznacza, że możesz określić typ danych, który jest przesyłany w odpowiedzi. Na przykład, `ResponseEntity<String>` oznacza, że ciało odpowiedzi to ciąg znaków.

    ```java
    ResponseEntity<List<String>> responseEntity = new ResponseEntity<>(listaStringow, HttpStatus.OK);
    ```

`ResponseEntity` jest często używane w kontrolerach Spring MVC do zwracania odpowiedzi HTTP. Przykładowe zastosowanie w kontrolerze może wyglądać tak:

```java
@RestController
public class MyController {

    @GetMapping("/example")
    public ResponseEntity<String> getExample() {
        String responseBody = "Przykładowa odpowiedź";
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "Wartość niestandardowego nagłówka");
        return new ResponseEntity<>(responseBody, headers, HttpStatus.OK);
    }
}
```

W tym przypadku, metoda `getExample` zwraca `ResponseEntity` z treścią odpowiedzi, nagłówkami i kodem stanu HTTP.

### w jakim celu przydatna jest baza elasticsearch

Elasticsearch to silnik wyszukiwania i analizy tekstu, który jest często wykorzystywany do przetwarzania i analizy danych tekstowych w czasie rzeczywistym. Poniżej przedstawiam kilka zastosowań i korzyści z korzystania z Elasticsearch:

1. **Wyszukiwanie Pełnotekstowe:**

    - Elasticsearch jest znany ze swojej skutecznej funkcji wyszukiwania pełnotekstowego. Jest ono przydatne w sytuacjach, gdy chcemy przeszukać duże zbiory danych tekstowych w poszukiwaniu dopasowań do określonych słów kluczowych.

2. **Analiza i Agregacja Danych:**

    - Elasticsearch oferuje zaawansowane możliwości analizy i agregacji danych. Możemy przetwarzać, grupować i analizować dane tekstowe, a także tworzyć różnego rodzaju statystyki i raporty.

3. **Wyszukiwanie Geo-Spatialne:**

    - Elasticsearch obsługuje również funkcje wyszukiwania oparte na danych przestrzennych, co jest przydatne w przypadku, gdy mamy dane geograficzne i chcemy przeszukiwać je na podstawie lokalizacji.

4. **Monitorowanie i Logowanie:**

    - Elasticsearch jest często używany w celu zbierania, przetwarzania i analizy logów aplikacji. W połączeniu z Kibana (narzędziem do wizualizacji danych), umożliwia skuteczne monitorowanie aplikacji, debugowanie i analizę problemów.

5. **Indeksacja i Przetwarzanie Dużych Wolumenów Danych:**

    - Elasticsearch jest zoptymalizowany do obsługi dużych wolumenów danych. Jest wydajny w indeksowaniu i przetwarzaniu danych w czasie rzeczywistym, co jest korzystne w przypadku aplikacji, które generują duże ilości danych na przykład w czasie rzeczywistym.

6. **Autocomplete i Sugestie:**

    - Elasticsearch może być używany do implementacji funkcji automatycznego uzupełniania i sugestii w wyszukiwarkach lub innych interfejsach użytkownika. To przydatne w celu zapewnienia szybkiego i skutecznego interfejsu wyszukiwania.

7. **Rozproszone Przetwarzanie:**

    - Elasticsearch został zaprojektowany z myślą o skalowalności i rozproszeniu. Może obsługiwać instalacje o dużej skali, co sprawia, że jest przydatny w środowiskach, gdzie wymagane jest rozproszone przetwarzanie danych.

8. **Integracja z Inne Narzędzia Elastic Stack:**
    - Elasticsearch jest często używany w połączeniu z innymi narzędziami z rodziny Elastic Stack, takimi jak Logstash (do przetwarzania logów) i Kibana (do wizualizacji danych), aby stworzyć kompleksowe rozwiązanie do analizy i monitorowania danych.

Podsumowując, Elasticsearch jest używany w sytuacjach, gdzie istnieje potrzeba zaawansowanego przeszukiwania, analizy i monitorowania danych tekstowych oraz wolumenów logów. Jest popularny w dziedzinach takich jak analiza danych, monitorowanie aplikacji, wyszukiwanie internetowe, systemy rekomendacyjne i wiele innych.

### czym jest multitenancy

Multitenancy (wielotenantowość) to architektoniczny model, w którym jedna instancja aplikacji lub systemu obsługuje jednocześnie wiele niezależnych użytkowników lub klientów, zwanych "tenantami". Każdy tenant ma dostęp do wspólnej instancji aplikacji, ale dane, konfiguracje i zasoby są izolowane od siebie, co pozwala na współdzielenie jednej aplikacji między wieloma klientami.

W multitenancy każdy tenant traktowany jest jak odrębny "lokator" w systemie, posiadający swoje własne zasoby, dane i ustawienia. Dzięki temu różne organizacje lub klienci mogą korzystać z jednej instancji aplikacji, a jednocześnie utrzymywać separację swoich danych oraz konfiguracji.

Istnieją różne formy multitenancy, w tym:

1. **Baza Danych Wielotenantowa:**

    - Każdy tenant ma swoją oddzielną bazę danych, co pozwala na pełną izolację danych między różnymi klientami.

2. **Wielotenantowość na Poziomie Wierszy (Row-Level Multitenancy):**

    - Dane dla różnych tenantów są przechowywane w tym samym zbiorze tabel, ale każdy wiersz w bazie danych zawiera identyfikator tenantów, co pozwala na ich rozróżnienie.

3. **Wielotenantowość na Poziomie Kolumn (Column-Level Multitenancy):**

    - W tym modelu, dane dla różnych tenantów są przechowywane w tych samych tabelach, ale każda kolumna zawiera dane jednego konkretnego tenantu.

4. **Wielotenantowość na Poziomie Schematu (Schema-Level Multitenancy):**
    - W systemach baz danych, które obsługują schematy, każdy tenant ma swój unikalny schemat, co pozwala na izolację danych.

Multitenancy jest często stosowany w chmurach obliczeniowych (cloud computing), aplikacjach biznesowych i systemach dostarczanych jako usługa (SaaS). Korzyści z multitenancy obejmują:

-   **Optymalizacja Zasobów:** Jedna instancja aplikacji może obsługiwać wielu klientów, co pozwala na lepsze wykorzystanie zasobów.

-   **Łatwiejsze Wdrożenia i Utrzymanie:** Aktualizacje i utrzymanie są łatwiejsze, ponieważ dotyczą jednej instancji, a nie wielu niezależnych instalacji.

-   **Skalowalność:** Możliwość elastycznego dostosowywania zasobów w zależności od potrzeb różnych klientów.

-   **Ekonomiczność:** Dzięki współdzieleniu zasobów koszty infrastruktury mogą być niższe.

Jednak multitenancy wiąże się również z wyzwaniami, takimi jak bezpieczeństwo (zapewnienie izolacji danych między tenantami), skalowalność, oraz konieczność obsługi różnorodnych wymagań i konfiguracji dla różnych klientów.

### adnotacja @ConditionalOnProperty

`@ConditionalOnProperty` to adnotacja w ekosystemie Spring Boot, która jest używana do warunkowego konfigurowania komponentów na podstawie istnienia lub wartości właściwości (property) w pliku konfiguracyjnym. Pozwala ona na elastyczne dostosowywanie konfiguracji aplikacji w zależności od ustawień środowiskowych lub preferencji użytkownika.

Przykład użycia adnotacji `@ConditionalOnProperty`:

```java
@Configuration
@ConditionalOnProperty(name = "myapp.feature.enabled", havingValue = "true")
public class MyFeatureConfig {
    // Konfiguracja dla funkcji, gdy właściwość "myapp.feature.enabled" ma wartość "true"
}
```

W tym przykładzie, `MyFeatureConfig` zostanie skonfigurowane tylko wtedy, gdy właściwość o nazwie "myapp.feature.enabled" istnieje i ma wartość "true". Jeśli właściwość nie istnieje lub ma inną wartość, konfiguracja tego komponentu nie będzie aktywowana.

Najważniejsze elementy adnotacji `@ConditionalOnProperty` to:

-   **name:** Określa nazwę właściwości, której wartość ma być sprawdzana. Na przykład, "myapp.feature.enabled".

-   **havingValue:** Określa oczekiwaną wartość właściwości. Jeśli ta wartość jest zdefiniowana, to konfiguracja będzie aktywowana tylko wtedy, gdy właściwość ma tę dokładną wartość.

-   **matchIfMissing:** Domyślnie ustawione na `true`. Jeśli właściwość nie jest zdefiniowana, a `matchIfMissing` jest ustawione na `true`, to konfiguracja również będzie aktywowana.

-   **prefix:** Prefix dla właściwości. Umożliwia skrócenie wielu warunków za pomocą tego samego prefixu.

Przykład z użyciem prefixu:

```java
@Configuration
@ConditionalOnProperty(prefix = "myapp.feature", name = "enabled", havingValue = "true")
public class MyFeatureConfig {
    // Konfiguracja dla funkcji, gdy właściwość "myapp.feature.enabled" ma wartość "true"
}
```

W tym przypadku, konfiguracja będzie aktywowana, jeśli właściwość o nazwie "myapp.feature.enabled" istnieje i ma wartość "true". Ta funkcja jest przydatna w sytuacjach, gdzie chcemy zgrupować warunki dla różnych właściwości pod jednym prefixem.

## Hibernate

### czym jest method query, HQL

Jeśli chodzi o Hibernate w kontekście Spring Boot, to często używane są zapytania HQL (Hibernate Query Language) oraz metody zapytań (query methods). Hibernate jest popularnym narzędziem do mapowania obiektowo-relacyjnego w aplikacjach Java, a Spring Boot ułatwia integrację z Hibernate.

1. **HQL (Hibernate Query Language):**
   HQL to język zapytań używany w Hibernate, który operuje na klasach i obiektach, a nie na tabelach i kolumnach, tak jak to robi SQL. Przykładowe zapytanie HQL wyglądałoby tak:

    ```java
    String hqlQuery = "SELECT e FROM YourEntity e WHERE e.someProperty = :propertyValue";
    Query query = session.createQuery(hqlQuery);
    query.setParameter("propertyValue", someValue);
    List<YourEntity> result = query.list();
    ```

    W tym przypadku "YourEntity" to nazwa Twojej encji, a "someProperty" to nazwa właściwości w tej encji.

2. **Metody zapytań (Query Methods):**
   W Spring Data można również definiować metody zapytań bezpośrednio w interfejsach repozytoriów. Spring Data używa mechanizmu nazewnictwa metod do generowania zapytań na podstawie nazw metod. Na przykład:

    ```java
    public interface YourEntityRepository extends JpaRepository<YourEntity, Long> {
        List<YourEntity> findBySomeProperty(String propertyValue);
    }
    ```

    W tym przypadku Spring Data automatycznie generuje zapytanie na podstawie nazwy metody (`findBySomeProperty`). Nie musisz pisać zapytań HQL, a Spring Data zajmuje się generowaniem odpowiedniego zapytania SQL na podstawie nazwy metody.

Kombinowanie Hibernate HQL i Spring Data metody zapytań daje elastyczność w obszarze dostępu do bazy danych w aplikacjach opartych na Java Spring Boot.

### adnotacja @EntityGraph - tylko do czego jest

Adnotacja `@EntityGraph` w Spring Data JPA służy do określania strategii ładowania powiązanych encji (ang. entity graphs). Jest to narzędzie pozwalające na zoptymalizowanie ładowania danych z bazy danych poprzez określenie, które powiązane encje powinny być wczytywane w trakcie pobierania danej encji.

Główne zastosowania `@EntityGraph` to:

1. **Ładowanie Leniwe (Lazy Loading):** Domyślnie, relacje w encjach mogą być ustawione na ładowanie leniwe (lazy loading), co oznacza, że dane związane z daną relacją nie są wczytywane od razu, ale dopiero w momencie, gdy są faktycznie potrzebne. `@EntityGraph` może zostać użyte, aby zadecydować, które relacje powinny zostać wczytane od razu, a które powinny być ładowane leniwe.

2. **Zoptymalizowane Ładowanie Powiązań (Fetch Graph):** Można użyć `@EntityGraph` do określenia, które powiązane encje powinny być wczytywane w jednym zapytaniu SQL (zamiast oddzielnych zapytań dla każdej encji). To może zredukować ilość zapytań do bazy danych, co jest istotne dla optymalizacji wydajności.

Przykład użycia `@EntityGraph` może wyglądać tak:

```java
@Entity
public class Author {
    // ...

    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    @EntityGraph(attributePaths = "books")
    private List<Book> books;

    // ...
}
```

W tym przypadku, zastosowanie `@EntityGraph` z atrybutem `attributePaths` pozwala określić, że w momencie, gdy `Author` zostanie pobrane, relacja `books` powinna zostać natychmiast wczytana (nawet jeśli jest ustawiona na leniwe ładowanie).

Ogólnie rzecz biorąc, `@EntityGraph` jest narzędziem do finezyjnej kontroli ładowania danych w aplikacji opartej na Spring Data JPA.

### problem bazodanowy N+1 czym on jest

Problem N+1 w kontekście baz danych występuje, gdy w trakcie pobierania danych z bazy danych jednocześnie pobierane są dane związane, ale w odseparowanych zapytaniach. To może prowadzić do nadmiernego obciążenia bazy danych i spadku wydajności aplikacji.

Problem N+1 można opisać w następujący sposób:

-   N reprezentuje liczbę głównych obiektów (encji), które są pobierane z bazy danych.
-   +1 reprezentuje dodatkowe zapytanie dla każdego z tych obiektów w celu pobrania powiązanych obiektów (relacji).

Na przykład, załóżmy, że masz listę autorów, a dla każdego autora chcesz pobrać jego książki. Jeśli użyjesz leniwego ładowania (lazy loading) dla relacji między autorem a książkami, każde zapytanie do bazy danych może być osobnym zapytaniem o książki autora, co prowadzi do N+1 zapytań.

Przykład w Hibernate z leniwym ładowaniem:

```java
List<Author> authors = session.createQuery("FROM Author", Author.class).list();

// Dla każdego autora zostanie wykonane osobne zapytanie, aby pobrać jego książki
for (Author author : authors) {
    List<Book> books = author.getBooks(); // N+1 queries
}
```

Aby rozwiązać problem N+1, można zastosować różne techniki, takie jak:

1. **Eager Loading:** Można zmienić strategię ładowania na "eager loading" dla danej relacji, co oznacza, że dane związane będą ładowane natychmiastowo razem z głównym zapytaniem.

    ```java
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private List<Book> books;
    ```

2. **JOIN Fetching:** Można użyć operacji JOIN w zapytaniu SQL, aby złączyć dane główne z danymi powiązanymi w jednym zapytaniu.

    ```sql
    SELECT a FROM Author a JOIN FETCH a.books
    ```

3. **Batch Fetching:** Można skorzystać z opcji batch fetching, aby zoptymalizować pobieranie danych.

    ```java
    @OneToMany(mappedBy = "author")
    @BatchSize(size = 10) // Określenie rozmiaru paczki
    private List<Book> books;
    ```

Dobieranie odpowiedniej strategii zależy od konkretnego przypadku i wymagań aplikacji, aby zminimalizować ilość zbędnych zapytań i poprawić wydajność systemu.

### specyfikacja JPA czym jest

Specyfikacja JPA (Java Persistence API) jest standardem programistycznym definiującym interfejsy programistyczne dla zarządzania danymi obiektowymi w aplikacjach Java EE (Enterprise Edition). JPA umożliwia programistom korzystanie z konceptów ORM (Object-Relational Mapping), co ułatwia mapowanie danych między relacyjnymi bazami danych a obiektowymi strukturami danych w języku Java.

Główne cele specyfikacji JPA to:

1. **Ułatwienie Mapowania Obiektowo-Relacyjnego (ORM):** JPA definiuje sposób mapowania klas i relacji pomiędzy obiektami a strukturami tabel w bazie danych. Programista nie musi pisać zapytań SQL, aby pobierać lub zapisywać dane; zamiast tego korzysta z obiektów i zapytań w stylu obiektowym.

2. **Zarządzanie Cyklem Życia Obiektów:** JPA oferuje mechanizmy do zarządzania cyklem życia obiektów. To oznacza, że programista może kontrolować, kiedy obiekty są tworzone, przechowywane, uaktualniane i usuwane w kontekście persystencji.

3. **Zapytania w Stylu Obiektowym:** JPA zapewnia narzędzia do tworzenia zapytań w sposób zorientowany obiektowo, co oznacza, że zapytania są formułowane na podstawie klas i obiektów, a nie na podstawie języka SQL.

4. **Transakcje:** JPA wspiera zarządzanie transakcjami, co jest istotne w kontekście aplikacji korzystających z baz danych.

5. **Portabilność Pomiędzy Implementacjami:** Specyfikacja JPA zapewnia abstrakcję pomiędzy kodem aplikacji a konkretną implementacją ORM. To oznacza, że można zmieniać dostawcę JPA (implementację) bez konieczności modyfikacji kodu aplikacji, co nazywa się portowalnością.

Popularne implementacje JPA to Hibernate, EclipseLink i Apache OpenJPA. Każda z tych implementacji oferuje swoje dodatkowe funkcje i rozszerzenia, ale spełniają one standardy określone w specyfikacji JPA.

### podstawowe adnotacje hibernate z relacjami OneToMany

Hibernate, jako implementacja JPA, dostarcza różne adnotacje do obsługi relacji pomiędzy encjami w modelu obiektowo-relacyjnym. Oto kilka podstawowych adnotacji Hibernate związanych z relacjami:

1. **@Entity:**

    - Oznacza, że klasa jest encją, którą można mapować na tabelę w bazie danych.

    ```java
    @Entity
    public class Author {
        // ...
    }
    ```

2. **@Table:**

    - Pozwala dostosować ustawienia tabeli, takie jak nazwa tabeli, schemat itp.

    ```java
    @Entity
    @Table(name = "authors")
    public class Author {
        // ...
    }
    ```

3. **@Id:**

    - Oznacza pole jako identyfikator encji.

    ```java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    ```

4. **@OneToMany:**

    - Oznacza relację jeden-do-wielu, gdzie jedna encja ma wiele powiązanych encji.

    ```java
    @OneToMany(mappedBy = "author")
    private List<Book> books;
    ```

5. **@ManyToOne:**

    - Oznacza relację wiele-do-jednego, gdzie wiele encji jest powiązanych z jedną encją.

    ```java
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    ```

6. **@JoinColumn:**

    - Określa kolumnę, która będzie używana jako klucz obcy w tabeli związanej.

    ```java
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    ```

7. **@JoinColumn (w @OneToMany):**

    - W przypadku relacji jeden-do-wielu, określa, jak kolumna w encji wiele będzie powiązana z encją jedną.

    ```java
    @OneToMany(mappedBy = "author")
    private List<Book> books;
    ```

8. **@GeneratedValue:**

    - Określa, jak wartość identyfikatora powinna być generowana (na przykład, automatycznie, poprzez inkrementację).

    ```java
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    ```

Te są jedynie podstawowe adnotacje, a Hibernate oferuje również inne, które mogą być używane w bardziej zaawansowanych scenariuszach. Ważne jest zrozumienie kontekstu i potrzeb aplikacji podczas używania tych adnotacji.

### czym jest fetchType

Atrybut `fetch` w adnotacjach związanych z relacjami w Hibernate (lub w ogóle w JPA - Java Persistence API) określa strategię ładowania powiązanych obiektów. Atrybut ten wpływa na to, jak Hibernate powinien zachować się, gdy próbuje pobrać powiązane obiekty z bazy danych w trakcie operacji zapytania.

Istnieją dwie podstawowe strategie ładowania w kontekście Hibernate:

1. **FetchType.LAZY (leniwe ładowanie):**

    - Oznacza, że powiązane obiekty nie są pobierane od razu podczas zapytania o główny obiekt, ale są ładowane dopiero w momencie, gdy są faktycznie potrzebne.
    - Jest to strategia bardziej wydajna w sytuacjach, gdy nie zawsze potrzebujesz pełnych powiązanych obiektów.

    ```java
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
    ```

2. **FetchType.EAGER (natychmiastowe ładowanie):**

    - Oznacza, że powiązane obiekty są natychmiastowo ładowane razem z głównym obiektem w jednym zapytaniu SQL.
    - Jest to strategia przydatna, gdy wiesz, że zawsze będziesz potrzebować pełnych powiązanych obiektów.

    ```java
    @OneToMany(mappedBy = "author", fetch = FetchType.EAGER)
    private List<Book> books;
    ```

Domyślnie, jeśli nie jest określona strategia ładowania (tj. `fetch` nie jest ustawione), używana jest strategia domyślna dla danego rodzaju relacji. Dla relacji `@ManyToOne` i `@OneToOne` jest to `FetchType.EAGER`, a dla relacji `@OneToMany` i `@ManyToMany` jest to `FetchType.LAZY`.

Wybór między leniwym a natychmiastowym ładowaniem zależy od specyfiki aplikacji i wymagań wydajnościowych. W praktyce często stosuje się leniwe ładowanie tam, gdzie to możliwe, aby unikać zbędnych zapytań do bazy danych i przyspieszyć operacje pobierania danych.

Atrybut `cascade` w adnotacjach związanych z relacjami w Hibernate (lub ogólnie w JPA - Java Persistence API) określa, które operacje powinny być propagowane z jednego obiektu encji na powiązany obiekt encji. Innymi słowy, `cascade` definiuje, jakie operacje na jednym obiekcie encji powinny wpływać na powiązane obiekty encji.

Atrybut `cascade` może przyjąć różne wartości (typy operacji), które decydują o tym, które operacje są kaskadowane. Niektóre z najczęściej używanych wartości `CascadeType` to:

1. **CascadeType.ALL:** Kaskaduje wszystkie operacje, tj. zapis, odczyt, aktualizację i usunięcie. Oznacza to, że operacje na jednym obiekcie encji będą miały wpływ na powiązane obiekty encji.

    ```java
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books;
    ```

2. **CascadeType.PERSIST:** Kaskaduje operację persist (zapis). Oznacza to, że gdy zostanie zapisany obiekt encji, zapisane zostaną również powiązane obiekty encji.

    ```java
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "author_id")
    private Author author;
    ```

3. **CascadeType.MERGE:** Kaskaduje operację merge (łączenie). Oznacza to, że gdy zostanie wykonane scalenie na obiekcie encji, operacja ta zostanie również wykonana na powiązanych obiektach encji.

    ```java
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "author_id")
    private Author author;
    ```

4. **CascadeType.REMOVE:** Kaskaduje operację remove (usuwanie). Oznacza to, że gdy zostanie usunięty obiekt encji, zostaną również usunięte powiązane obiekty encji.

    ```java
    @OneToMany(mappedBy = "author", cascade = CascadeType.REMOVE)
    private List<Book> books;
    ```

5. **CascadeType.REFRESH:** Kaskaduje operację refresh (odświeżanie). Oznacza to, że gdy zostanie odświeżony obiekt encji, operacja ta zostanie również wykonana na powiązanych obiektach encji.

    ```java
    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "author_id")
    private Author author;
    ```

6. **CascadeType.DETACH:** Kaskaduje operację detach (odłączanie). Oznacza to, że gdy zostanie odłączony obiekt encji, operacja ta zostanie również wykonana na powiązanych obiektach encji.

    ```java
    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "author_id")
    private Author author;
    ```

Warto dobrać odpowiednie wartości `CascadeType` w zależności od konkretnych potrzeb aplikacji i wymagań dotyczących zarządzania cyklem życia encji.

Domyślnie w kontekście Hibernate i JPA (Java Persistence API), jeśli nie zostanie podana żadna wartość dla atrybutu `cascade` w adnotacjach związanych z relacjami, takich jak `@OneToMany` czy `@ManyToOne`, to zachowanie kaskadowe jest wyłączone (`CascadeType.NONE`).

Innymi słowy, jeżeli adnotacja wygląda na przykład tak:

```java
@OneToMany(mappedBy = "author")
private List<Book> books;
```

To oznacza, że operacje na obiekcie `Author` nie będą miały wpływu na operacje powiązane z obiektami `Book`. Nie zostanie automatycznie wywołane zapisywanie (`persist`), łączenie (`merge`), usuwanie (`remove`) itp. na obiektach `Book` w wyniku operacji na obiekcie `Author`.

Jeśli chodzi o inne operacje, takie jak `refresh` czy `detach`, to domyślnie również są wyłączone, chyba że zostaną jawnie dodane do atrybutu `cascade`. Domyślnie nie są kaskadowane.

Warto zaznaczyć, że domyślne zachowanie może się różnić w zależności od dostawcy JPA (Hibernate, EclipseLink, itp.), jednak zazwyczaj jest to ustawione na `CascadeType.NONE`.

### czym jest orphanRemoval

Atrybut `orphanRemoval` w kontekście Hibernate i JPA (Java Persistence API) odnosi się do zachowania kaskadowego związane z usuwaniem "osieroconych" (ang. orphan) obiektów encji. Obiekty "osierocone" to te, które zostały odłączone od swojego obiektu nadrzędnego (encji właściciela) i nie mają już z nim powiązania.

Aby lepiej zrozumieć `orphanRemoval`, przyjrzyjmy się sytuacji, w której mamy relację `@OneToMany` między dwoma encjami: `Author` i `Book`. Dla tej relacji mówimy, że `Author` jest właścicielem relacji, a `Book` jest właścicielem obiektu.

```java
@Entity
public class Author {
    @OneToMany(mappedBy = "author", orphanRemoval = true)
    private List<Book> books;
    // ...
}

@Entity
public class Book {
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    // ...
}
```

W tym przypadku, gdy `orphanRemoval` jest ustawione na `true` dla relacji `books` w encji `Author`, to oznacza, że jeśli jakieś obiekty `Book` zostaną usunięte z listy `books` w `Author` (czyli staną się "osierocone"), to zostaną one automatycznie usunięte z bazy danych.

Przykład:

```java
Author author = entityManager.find(Author.class, authorId);
Book bookToRemove = author.getBooks().get(0);
author.getBooks().remove(bookToRemove); // Usunięcie z listy "books"

// W sytuacji, gdy orphanRemoval jest ustawione na true, poniższa operacja usuwa obiekt "bookToRemove" z bazy danych.
// W przypadku orphanRemoval=false, obiekt "bookToRemove" pozostanie w bazie danych, ale bez powiązania z "author".
entityManager.flush();
```

Ustawienie `orphanRemoval` na `true` jest używane, gdy chcemy, aby obiekty powiązane były usuwane wraz z obiektem nadrzędnym w sytuacji, gdy zostaną one usunięte z listy (lub kolekcji) obiektów nadrzędnych. To jest przydatne w sytuacjach, gdzie chcemy utrzymać spójność i integrować cykle życia obiektów. Jednak należy używać tego atrybutu ostrożnie, ponieważ może prowadzić do nieoczekiwanych usunięć, szczególnie w sytuacjach, gdy obiekty `Book` mogą być używane w innych kontekstach czy przez inne obiekty.

Czyli jak książka nie będzie miała autora to zostanie usunięta, tak?

Tak, jeśli `orphanRemoval` jest ustawione na `true` dla relacji `@OneToMany` między encją `Author` a `Book`, to usunięcie książki z listy książek autora spowoduje również jej fizyczne usunięcie z bazy danych, jeśli nie jest powiązana z żadnym innym autorem.

Przykład:

```java
@Entity
public class Author {
    @OneToMany(mappedBy = "author", orphanRemoval = true)
    private List<Book> books;
    // ...
}

@Entity
public class Book {
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
    // ...
}
```

```java
Author author = entityManager.find(Author.class, authorId);
Book bookToRemove = author.getBooks().get(0);
author.getBooks().remove(bookToRemove); // Usunięcie z listy "books"

// W sytuacji, gdy orphanRemoval jest ustawione na true, poniższa operacja usuwa obiekt "bookToRemove" z bazy danych,
// ponieważ teraz obiekt "bookToRemove" nie ma przypisanego autora.
entityManager.flush();
```

W tym przykładzie, gdy usuniesz książkę z listy książek autora i ustawisz `entityManager.flush()`, Hibernate zauważy, że obiekt `bookToRemove` nie jest już powiązany z żadnym autorem, co spowoduje usunięcie go z bazy danych.

Jest to jedno z zastosowań `orphanRemoval` — automatyczne usuwanie obiektów, które stały się "osierocone", czyli nie mają już żadnego właściciela. Ważne jest, aby używać tego ustawienia z rozwagą, aby uniknąć nieoczekiwanych usunięć danych.

### baza H2 co to

H2 to system zarządzania relacyjnymi bazami danych (RDBMS) napisany w języku Java. Jest to lekka, szybka i osadzalna baza danych, co oznacza, że można ją łatwo integrować z aplikacjami napisanymi w języku Java. H2 obsługuje standardy SQL oraz oferuje funkcje zgodne z relacyjnym modelem danych.

Oto kilka cech charakteryzujących bazę danych H2:

1. **Osadzalna:** H2 jest często używane jako baza danych wbudowana w aplikacje Java. Można uruchamiać ją w trybie osadzonym, co oznacza, że działa jako część aplikacji, a dane są przechowywane lokalnie.

2. **Lekka:** Baza danych H2 jest lekka i ma niewielki rozmiar, co czyni ją atrakcyjną opcją dla projektów o ograniczonym zasobach.

3. **Wsparcie dla różnych trybów pracy:** H2 obsługuje różne tryby pracy, takie jak tryb osadzony, tryb klient-serwer, a także tryb pamięci podręcznej (in-memory), w którym dane są przechowywane w pamięci RAM i nie zapisywane na dysku.

4. **Wsparcie dla różnych silników:** H2 obsługuje różne silniki bazodanowe, takie jak silnik plikowy, silnik pamięciowy, a także silniki dla trybów osadzonego i klient-serwer.

5. **Obsługa wielu trybów zgodności:** H2 pozwala na pracę w różnych trybach zgodności, co pozwala na dostosowanie zachowania bazy danych do różnych standardów SQL i specyfikacji.

6. **Wsparcie dla transakcji:** H2 obsługuje transakcje, co pozwala na wykonywanie operacji bazodanowych w sposób atomowy, spójny, izolowany i trwały (ACID).

7. **Narzędzia do administracji:** H2 dostarcza narzędzia wiersza poleceń, narzędzia graficzne (np. H2 Console) oraz interfejsy programistyczne (API) dla Java, umożliwiające zarządzanie bazą danych.

Baza danych H2 jest często używana w scenariuszach, gdzie konieczne jest proste, osadzone, a jednocześnie wydajne rozwiązanie bazodanowe dla aplikacji napisanych w języku Java.

### czym jest adnotacja @Transactional

Adnotacja `@Transactional` jest adnotacją używaną w kontekście programowania w języku Java, a szczególnie w aplikacjach opartych na Spring Framework. Adnotacja ta służy do oznaczania metod, które powinny być wykonane w ramach jednej transakcji.

W kontekście baz danych i zarządzania transakcjami, adnotacja `@Transactional` działa na poziomie metody. Gdy metoda oznaczona tą adnotacją jest wywoływana, Spring automatycznie zarządza transakcją wokół tej metody. Oznacza to, że transakcja zostanie utworzona przed rozpoczęciem wykonania metody, a następnie zostanie zakończona po zakończeniu metody. W przypadku, gdy metoda zakończy się powodzeniem, transakcja zostanie zatwierdzona (commit). W przypadku wystąpienia wyjątku, transakcja zostanie cofnięta (rollback), przywracając bazę danych do stanu sprzed rozpoczęcia transakcji.

Przykład użycia adnotacji `@Transactional` w Spring:

```java
import org.springframework.transaction.annotation.Transactional;

@Service
public class MyService {

    @Autowired
    private MyRepository myRepository;

    @Transactional
    public void performTransactionalOperation() {
        // Operacje bazodanowe
        myRepository.save(entity1);
        myRepository.save(entity2);

        // Inne operacje
        // ...

        // Jeśli ta metoda zakończy się powodzeniem, transakcja zostanie zatwierdzona.
        // W przypadku wyjątku, transakcja zostanie cofnięta.
    }
}
```

W powyższym przykładzie, metoda `performTransactionalOperation` została oznaczona adnotacją `@Transactional`. Oznacza to, że wszystkie operacje bazodanowe wykonywane wewnątrz tej metody będą zarządzane przez transakcję. Jeśli któraś z tych operacji zakończy się niepowodzeniem (np. wystąpi wyjątek), transakcja zostanie cofnięta, przywracając bazę danych do stanu przed rozpoczęciem transakcji. W przeciwnym razie, gdy metoda zakończy się powodzeniem, transakcja zostanie zatwierdzona.

## Bazy danych:

### powtórzyć podstawowe pojęcia bazodanowe (tabela, rekord, rodzaje relacji, indeks, klucz podst. obcy, constrainty)

TODO uzupełnić

### Liquibase czym jest

TODO uzupełnić

## GIT

### podstawowe pojęcia, branch, merge commit push pull

TODO uzupełnić

### czym jest gitflow

TODO uzupełnić

### czym jest release oraz release candidate

TODO uzupełnić

## Testy:

### co to jest test jednostkowy, asercje

TODO uzupełnić

### co to jest mockito, co to given when then, czym jest mock, czym jest metoda verify w mockito

TODO uzupełnić

### czym są testy kontraktowe

TODO uzupełnić

### na czym polega TDD

TODO uzupełnić

## Maven:

### w maven czym są sekcje dependency,build,plugin, scope provided

TODO uzupełnić

### czym są komendy maven: clean compile install

TODO uzupełnić

## Bezpieczeństwo:

### czym jest Keycloak (co to jest realm, uprawnienia)

TODO uzupełnić

### czym jest token JWT

TODO uzupełnić

## Architektura

### czym jest CQRS (dodatkowo czym jest readmodel)

TODO uzupełnić

### czym są mikroserwisy (oraz podstawowe pojęcia: api gateway, load balancer, circuit breaker)

TODO uzupełnić

### czym jest replikacja w mikroserwisach i kafka (co to jest topic w kafka)

TODO uzupełnić

### czym jest wzorzec backend for frontend

TODO uzupełnić

## Inne:

### czym jest lombok i podstawowe adnotacje

TODO uzupełnić

### kody http 200,201,204,400,401,403,409,422

TODO uzupełnić

### czym jest specyfikacja OpenAPI

TODO uzupełnić

### zasady restful api - podstawowe

TODO uzupełnić

### czym jest amazon S3

TODO uzupełnić

### czym jest CI/CD

TODO uzupełnić

### kim jest osoba - DevOps

TODO uzupełnić

### na czym polega scrum, daily, review, retro, planning

TODO uzupełnić

### czym jest owasp - tylko wiedzieć

TODO uzupełnić

### domain driven design - definicja

TODO uzupełnić

### do czego używa sie postman

TODO uzupełnić

### czym jest docker, dockerfile, docker compose

TODO uzupełnić

TODO uzupełnić

### sama definicja czym jest kubernetes (co to jest pod), kibana, grafana
