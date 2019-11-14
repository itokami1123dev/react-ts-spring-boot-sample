最初に
--

### 全体をビルドしてください。 npmの設定もできます

```bash
$ mvn clean install
```

開発は2つのターミナル使います
--

### spring-boot 起動用

```bash
$ mvn spring-boot:run 
```
Tomcat started on port(s): 8080で起動しますが直接は開きません


### react 監視ビルド用

```bash
$ cd frontend
$ npm run start
```
http://localhost:8081/ のURLで開発します。Reactを修正すると勝手に反映されます。


Docker でビルドするサンプル
---

```bash
$ docker build --tag="react-ts-spring-boot-sample" .
$ docker run --name sample -it -p 8080:8080 -d react-ts-spring-boot-sample
```