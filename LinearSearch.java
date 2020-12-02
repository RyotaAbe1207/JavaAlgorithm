package chapter2;

public class LinearSearch {
	static private class Entry{	//インナークラス
		int key;		//比較対象となるキー
		Object data; 	//それ以外の情報
		private Entry(int key, Object data) {
			this.key = key;
			this.data = data;
			}
		}
		final static int MAX = 100;			//データの最大個数
		Entry[] table = new Entry[MAX];		//データを格納する配列
		int n = 0;							//tableに登録されているデータの個数

		public void add(int key, Object data) {
			if(n >= MAX) {
				throw new IllegalStateException("データの個数が多すぎます");
			}
			table[n++] = new Entry(key, data);
			//あくまでもインスタンス格納．
			//ただ，コンストラクタを呼び出して，インスタンス変数に値を代入している．
			System.out.println(n);
		}
		public Object search(int key) {
			int i = 0;
			while(i < n) {
				if(table[i].key == key)
					return(table[i].data);
				i++;
			}
			return null;
	}
}
