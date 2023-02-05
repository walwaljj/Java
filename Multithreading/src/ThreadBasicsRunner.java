
// Thread 구현하기
//방법1 : extends Thread
//방법2 : implements Runnable

class Task1 extends Thread {
	@Override
	public void run() {

		System.out.print("\nTask1 started => ");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask1 Done ");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 started => ");
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask2 Done ");

	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		/* --NEW : start 메소드 실행 전의 thread , 그 후 thrminated의 상태.
		 * --RUNNABLE : 실행하려고 하지만 다른 Thread가 우선 실행되는 상태.
		 * --RUNNING : 실행중
		 * --BLOCKED/WAITING : 외부 인터페이스 , DB 등으로 입력을 위해 대기중인상태. 실행이 완료 되지 않은 Thread로부터 테이터를 입력받아야하는 상태.
		 * --TERMINATED/DEAD : 메소드 실행이 끝난 후 의 상태.
		 * 
		 * 
Task1 kicked Off (new 단계)
Task2 kicked Off 
Task1 started => 101 (task1 RUNNING 단계) 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 
Task3 kicked Off 301 121 302 122 123 124 125 126 127 
Task2 started => 303 (task1,2 RUNNABLE 단계, task3 main 메서드가 실행중임 . cpu 차례를 기다림.)
 					201(task1 RUNNABLE 단계) 304 305 306 307 308 128 309 310 311 202 312 129 313 314 315 316 317 318 319 320 321 322 323 324 325 326 327 328 329 330 331 332 333 203 334 335 130 131 132 133 134 336 337 338 339 340 204 205 206 207 208 209 210 211 341 135 136 137 138 139 140 141 142 143 144 145 146 147 148 342 212 343 149 344 345 346 347 348 349 350 351 213 352 353 354 355 356 357 358 359 150 360 361 362 363 364 365 366 367 368 369 370 371 372 373 374 375 376 377 378 379 380 381 382 383 384 385 386 387 388 389 390 391 392 393 394 395 396 397 398 399 
Task3 Done 214 151 152 153 154 155 156 157 158 159 160 161 215 216 217 218 219 220 221 222 223 162 163 164 165 224 225 226 227 228 229 230 231 232 166 167 233 234 235 236 237 238 239 240 241 242 243 244 168 245 169 246 170 171 172 173 174 175 247 248 249 250 251 176 177 252 253 254 178 255 256 257 258 259 260 261 262 263 264 265 266 267 268 269 270 179 180 181 182 183 184 185 186 187 271 272 273 274 275 276 277 278 279 280 281 282 283 284 285 286 287 288 289 290 188 189 190 191 192 193 194 195 196 197 198 199 
Task1 Done 291 292 293 294 295 296 297 298 299 
Task2 Done (TERMINATED/DEAD 단계)
		 * */
		

		System.out.print("\nTask1 kicked Off ");
		Task1 task1 = new Task1();
		task1.setPriority(1);//Changes the priority of this thread. 스레드 우선순위 변경.
		//				범위는 MAX_PRIORITY(10) 와 MIN_PRIORITY(1) 사이.
		//				10은 가장 빠르게 실행을 완료하게 도와줌
//		task1.run();// 보통 메서드의 실행 방법 : task1 후 task2 실행됨.
		task1.start();// Thread 실행법 : task1 와 task2가 함께 실행됨.


		System.out.print("\nTask2 kicked Off ");
		Task2 task2 = new Task2();
		Thread thread = new Thread(task2);
		thread.setPriority(10);// 순서를 추천만 하는 것으로 task2 가 항상 빠르게 끝나진 않는다.
		thread.start();// task1 후 바로 task2 시작 (거의동시) , task3 시작.
						// 즉 , 병렬적으로 이뤄지며 작업을 동시에 처리가능.

		// task1,2,3 동시 실행이 아닌 task1 이 끝난 후 실행시키기
		task1.join(); // .join() ==> Waits for this thread to die
						// task1의 thread가 끝날 때 까지 대기시킴.
		// 예외 발생시킴.
		Thread.sleep(1000);// Thread를 10초간 대기시킴
//		Thread.yield();// 현재 Thread(task1)가 사용하고 있는 cpu를 다른 thread(task2)가 사용하도록 양보해줌.
		thread.join();

		System.out.print("\nTask3 kicked Off ");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask3 Done ");
		System.out.print("\nMain Done");
	}

}
