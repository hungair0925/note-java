
### 手動コンパイル・実行手順

#### 1. ソースコードを作成
```java
// Hello.java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

#### 2. コンパイル
```bash
javac -d {コンパイル結果格納先ディレクトリパス} src/Hello.java
```
- `-d`オプションは、コンパイル結果を対象のディレクトリに出力

#### 3. 実行
```bash
java -cp {コンパイル結果格納先ディレクトリパス} Hello
```

- `-cp`オプションは、コンパイルされたクラスファイルを含むディレクトリを指定

