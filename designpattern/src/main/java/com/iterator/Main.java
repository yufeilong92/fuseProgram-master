package com.iterator;

public class Main {
	/**
	 * ������ģʽ
	 * @param args
     */
	public static void main(String[] args) {
		BookShelf bookShelf=new BookShelf(4);
		bookShelf.appendBook(new Book("ͼ�����ģʽ"));
		bookShelf.appendBook(new Book("δ����ʷ"));
		bookShelf.appendBook(new Book("Android�����Ż�"));
		bookShelf.appendBook(new Book("����Ա����֮��"));
		Iterator iterator=bookShelf.iterator();
		while (iterator.hasNext()) {
			Book book = (Book) iterator.next();
			System.out.println(book.getName());
		}
	}

}
