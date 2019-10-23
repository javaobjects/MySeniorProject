package com.neuedu.chapter03.file;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatchServiceDemo {

	public static void main(String[] args) {
		/*���Ŀ��·�� */
		Path path = Paths.get("D:\\temp");
		try {
			/* �����ļ���ض��� */
			WatchService watchService = FileSystems.getDefault().newWatchService();
			/* ע���ļ���ص������¼����� */
			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);
			/* ѭ������ļ� */
			while (true) {
				WatchKey watchKey = watchService.take();
				/* ���������¼��������ļ� */
				for (WatchEvent<?> event : watchKey.pollEvents())
					System.out.println(event.context().toString() + " �¼����ͣ�"
							+ event.kind());
				if (!watchKey.reset())
					return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
