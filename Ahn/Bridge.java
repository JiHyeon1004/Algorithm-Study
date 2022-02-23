package com.ssafy.hw03.step2;

import java.util.Scanner;

public class Bridge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ����
		int n = sc.nextInt();
		int[][] island = new int[n][n];
		int[][] dis_island_x = new int[n][n];
		int[][] dis_island_y = new int[n][n];
		int distance = 1;
		int dis_island = 0;
		// xy�� �Է�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				island[i][j] = sc.nextInt();
			}
		}
		// x�� �б�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// ���� �������� �Ÿ�
				if (island[i][j] == 1) {
					distance = 1;
					dis_island_x[i][j] = distance;
				} else if (island[i][j] == 0) {
					distance++;
					dis_island_x[i][j] = distance;
				}
			}
		}
		// y�� �б�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// ���� �������� �Ÿ�
				if (island[j][i] == 1) {
					distance = 1;
					dis_island_y[j][i] = distance;
				} else if (island[j][i] == 0) {
					distance++;
					dis_island_y[j][i] = distance;
				}
			}
		}
		// �Ÿ� ���ϱ�
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// ���� �������� �Ÿ�
				if (dis_island_x[i][j] >= dis_island) {
					dis_island = dis_island_x[i][j];
				} 
				if (dis_island_y[j][i] >= dis_island) {
					dis_island = dis_island_y[j][i];
				}
			}
		}
		System.out.println(dis_island);
	}
}
