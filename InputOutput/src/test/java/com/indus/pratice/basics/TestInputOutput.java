package com.indus.pratice.basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

;

public class TestInputOutput {

	public void main() {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {

			in = new FileInputStream(
					"C:\\Indus\\Workspaces\\Traning\\InputOutput\\src\\main\\resources\\InputFile.txt");

			out = new FileOutputStream(
					"C:\\Indus\\Workspaces\\Traning\\InputOutput\\src\\main\\resources\\OutputFile.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

			try {
				if (in != null) {

					in.close();

				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
