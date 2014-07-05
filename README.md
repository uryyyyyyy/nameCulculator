nameCulculator
==============



## 【問題】

テキストファイル names.txt を読み取って、まずアルファベット順にソートする。
のち, 各名前のアルファベット一文字ずつについて、リスト中の出現数を求め、和を計算する。
そして、ソート後の順番とアルファベットの出現数の和を掛け合わせて出力してください。



## 【例】

 names.txt
```
"MARY","PATRICIA","LINDA","BARBARA"
```

が与えられたとき、

MARYは、順番は３番目、
Mが１回、Aが７回、Rが４回、Yが１回登場するので、
`3 * (1+7+4+1) = 39`
となります。

同様の処理をすると、

```
BARBARA -> 1*(2+7+4+2+7+4+7)
LINDA -> 2*(1+3+1+1+7)
PATRICIA -> 4*(1+7+1+4+3+1+3+7)
```

となり、解は以下になります。

output.txt

```
BARBARA 33
LINDA 26
MARY 39
PATRICIA 108
```


## 【入出力】

{ProjectRoot}にnames.txtがあるので、
score.txtを返して下さい。

入力サンプルは以下に載せている参考元のnames.txtと同じ形式です。

## 【参考元】

http://odz.sakura.ne.jp/projecteuler/index.php?cmd=read&page=Problem%2022

