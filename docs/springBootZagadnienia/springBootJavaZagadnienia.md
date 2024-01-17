# springBootJavaZagadnienia

- [springBootJavaZagadnienia](#springbootjavazagadnienia)
  - [Java](#java)
    - [czym jest java streams (najważniejsze to znać .filter() .map() .findFirst() .toList())](#czym-jest-java-streams-najważniejsze-to-znać-filter-map-findfirst-tolist)
    - [przetwarzanie sekwencyjne i równoległe](#przetwarzanie-sekwencyjne-i-równoległe)
    - [czym jest pojo](#czym-jest-pojo)
    - [czym są typy generyczne w java (malo ich używamy)](#czym-są-typy-generyczne-w-java-malo-ich-używamy)
    - [czym jest clean code, zasady kiss, yagni, dry](#czym-jest-clean-code-zasady-kiss-yagni-dry)
    - [czym jest java optional](#czym-jest-java-optional)
    - [NullPointerException](#nullpointerexception)
    - [czym jest ternary operator w java](#czym-jest-ternary-operator-w-java)
  - [Spring](#spring)
    - [adnotacja Autowired co to](#adnotacja-autowired-co-to)
    - [adnotacja ComponentScan co to](#adnotacja-componentscan-co-to)
    - [adnotacja Bean co to](#adnotacja-bean-co-to)
    - [profile w spring (np development, production)](#profile-w-spring-np-development-production)
    - [feign client co to](#feign-client-co-to)
    - [adnotacja EntityScan co to](#adnotacja-entityscan-co-to)
    - [czym jest programowanie aspektowe i jeden przykład wykorzystania](#czym-jest-programowanie-aspektowe-i-jeden-przykład-wykorzystania)
    - [mapstruct](#mapstruct)
    - [czym jest Slf4j](#czym-jest-slf4j)
    - [czym jest DTO i po co sie stosuje](#czym-jest-dto-i-po-co-sie-stosuje)
    - [czym jest ResponseEntity](#czym-jest-responseentity)
    - [w jakim celu przydatna jest baza elasticsearch](#w-jakim-celu-przydatna-jest-baza-elasticsearch)
    - [czym jest multitenancy](#czym-jest-multitenancy)
    - [adnotacja @ConditionalOnProperty](#adnotacja-conditionalonproperty)
  - [Hibernate](#hibernate)
    - [czym jest method query, HQL](#czym-jest-method-query-hql)
    - [adnotacja @EntityGraph - tylko do czego jest](#adnotacja-entitygraph---tylko-do-czego-jest)
    - [problem bazodanowy N+1 czym on jest](#problem-bazodanowy-n1-czym-on-jest)
    - [specyfikacja JPA czym jest](#specyfikacja-jpa-czym-jest)
    - [podstawowe adnotacje hibernate z relacjami OneToMany itp, czym jest fetchType oraz cascadeType, orphanRemoval](#podstawowe-adnotacje-hibernate-z-relacjami-onetomany-itp-czym-jest-fetchtype-oraz-cascadetype-orphanremoval)
    - [baza H2 co to](#baza-h2-co-to)
    - [czym jest adnotacja @Transactional](#czym-jest-adnotacja-transactional)
  - [Bazy danych:](#bazy-danych)
    - [powtórzyć podstawowe pojęcia bazodanowe (tabela, rekord, rodzaje relacji, indeks, klucz podst. obcy, constrainty)](#powtórzyć-podstawowe-pojęcia-bazodanowe-tabela-rekord-rodzaje-relacji-indeks-klucz-podst-obcy-constrainty)
    - [Liquibase czym jest](#liquibase-czym-jest)
  - [GIT](#git)
    - [podstawowe pojęcia, branch, merge commit push pull](#podstawowe-pojęcia-branch-merge-commit-push-pull)
    - [czym jest gitflow](#czym-jest-gitflow)
    - [czym jest release oraz release candidate](#czym-jest-release-oraz-release-candidate)
  - [Testy:](#testy)
    - [co to jest test jednostkowy, asercje](#co-to-jest-test-jednostkowy-asercje)
    - [co to jest mockito, co to given when then, czym jest mock, czym jest metoda verify w mockito](#co-to-jest-mockito-co-to-given-when-then-czym-jest-mock-czym-jest-metoda-verify-w-mockito)
    - [czym są testy kontraktowe](#czym-są-testy-kontraktowe)
    - [na czym polega TDD](#na-czym-polega-tdd)
  - [Maven:](#maven)
    - [w maven czym są sekcje dependency,build,plugin, scope provided](#w-maven-czym-są-sekcje-dependencybuildplugin-scope-provided)
    - [czym są komendy maven: clean compile install](#czym-są-komendy-maven-clean-compile-install)
  - [Bezpieczeństwo:](#bezpieczeństwo)
    - [czym jest Keycloak (co to jest realm, uprawnienia)](#czym-jest-keycloak-co-to-jest-realm-uprawnienia)
    - [czym jest token JWT](#czym-jest-token-jwt)
  - [Architektura](#architektura)
    - [czym jest CQRS (dodatkowo czym jest readmodel)](#czym-jest-cqrs-dodatkowo-czym-jest-readmodel)
    - [czym są mikroserwisy (oraz podstawowe pojęcia: api gateway, load balancer, circuit breaker)](#czym-są-mikroserwisy-oraz-podstawowe-pojęcia-api-gateway-load-balancer-circuit-breaker)
    - [czym jest replikacja w mikroserwisach i kafka (co to jest topic w kafka)](#czym-jest-replikacja-w-mikroserwisach-i-kafka-co-to-jest-topic-w-kafka)
    - [czym jest wzorzec backend for frontend](#czym-jest-wzorzec-backend-for-frontend)
  - [Inne:](#inne)
    - [czym jest lombok i podstawowe adnotacje](#czym-jest-lombok-i-podstawowe-adnotacje)
    - [kody http 200,201,204,400,401,403,409,422](#kody-http-200201204400401403409422)
    - [czym jest specyfikacja OpenAPI](#czym-jest-specyfikacja-openapi)
    - [zasady restful api - podstawowe](#zasady-restful-api---podstawowe)
    - [czym jest amazon S3](#czym-jest-amazon-s3)
    - [czym jest CI/CD](#czym-jest-cicd)
    - [kim jest osoba - DevOps](#kim-jest-osoba---devops)
    - [na czym polega scrum, daily, review, retro, planning](#na-czym-polega-scrum-daily-review-retro-planning)
    - [czym jest owasp - tylko wiedzieć](#czym-jest-owasp---tylko-wiedzieć)
    - [domain driven design - definicja](#domain-driven-design---definicja)
    - [do czego używa sie postman](#do-czego-używa-sie-postman)
    - [czym jest docker, dockerfile, docker compose](#czym-jest-docker-dockerfile-docker-compose)
    - [sama definicja czym jest kubernetes (co to jest pod), kibana, grafana](#sama-definicja-czym-jest-kubernetes-co-to-jest-pod-kibana-grafana)

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

- `@FeignClient` to adnotacja, która oznacza interfejs jako Feign Client.
- `name` to unikalna nazwa klienta Feign, która może być używana w kontekście Spring do odnajdywania klienta.
- `url` to adres URL docelowej usługi, z którą Feign będzie komunikować się.
- `ExampleFeignClient` to interfejs z metodą `getResource`, która jest zdalnym wywołaniem do usługi o nazwie "example-service".

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

TODO uzupełnić

### czym jest Slf4j

TODO uzupełnić

### czym jest DTO i po co sie stosuje

TODO uzupełnić

### czym jest ResponseEntity

TODO uzupełnić

### w jakim celu przydatna jest baza elasticsearch

TODO uzupełnić

### czym jest multitenancy

TODO uzupełnić

### adnotacja @ConditionalOnProperty

TODO uzupełnić

## Hibernate

### czym jest method query, HQL

TODO uzupełnić

### adnotacja @EntityGraph - tylko do czego jest

TODO uzupełnić

### problem bazodanowy N+1 czym on jest

TODO uzupełnić

### specyfikacja JPA czym jest

TODO uzupełnić

### podstawowe adnotacje hibernate z relacjami OneToMany itp, czym jest fetchType oraz cascadeType, orphanRemoval

TODO uzupełnić

### baza H2 co to

TODO uzupełnić

### czym jest adnotacja @Transactional

TODO uzupełnić

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
