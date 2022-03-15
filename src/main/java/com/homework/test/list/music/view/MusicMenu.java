package com.homework.test.list.music.view;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.homework.test.list.music.manager.MusicManager;
import com.homework.test.list.music.vo.Music;
import com.homework.test.list.music.vo.MusicSingerComp;
import com.homework.test.list.music.vo.MusicTitleComp;

public class MusicMenu {

    private Scanner sc = new Scanner(System.in);

    private MusicManager manager = new MusicManager();

    private String menu = "================ Music Playlist Menu ================\n"
            + "1.목록보기\n"
            + "2.마지막에 음악추가\n"
            + "3.맨처음에 음악추가\n"
            + "4.곡삭제\n"
            + "5.곡변경\n"
            + "6.곡명검색\n"
            + "7.가수검색\n"
            + "8.목록정렬(곡명오름차순)\n"
            + "0.종료\n"
            + "=====================================================\n"
            + ">> 메뉴선택 : ";

    public void mainMenu() {
        while(true) {
            System.out.print(menu);
            String choice = sc.next();
            List<Music> musicList = null;

            switch(choice) {
                case "1" :
                    musicList = manager.selectList();  //List<Music> 가져오기
                    printList(musicList);			   //List<Music> 출력하기
                    break;
                case "2" :
                    manager.addList(inputMusic());
                    break;
                case "3" :
                    manager.addAtZero(inputMusic());
                    break;
                case "4" :
                    boolean remove = manager.removeMusic(inputTitle());
                    String removeTitle = remove ? "음악이 삭제되었습니다." : "제목을 잘못입력하셨습니다. 삭제되지 않았습니다.";
                    System.out.println(removeTitle);
                    break;
                case "5" :
                    boolean replace = manager.replaceMusic(inputMusic(), inputMusic());
                    String replaceMusic = replace? "음악이 교체되었습니다." : "등록된 해당 음악이 없습니다.";
                    System.out.println(replaceMusic);
                    break;
                case "6" :
                    manager.searchMusicByTitle(inputTitle());
                    break;
                case "7" :
                    manager.searchMusicBySinger(inputSinger());
                    break;
                case "8" :
                    sortMenu();
                    break;

                case "0" : return; //mainMenu를 호출한 곳으로 return (MusicRun-main)
                default : System.out.println("잘못 입력하셨습니다.");
            }

        }
    }

    public void printList(List<Music> musicList) {
        for(Music music : musicList) {
            System.out.println(music.getTitle() + " - " + music.getSinger());

        }
    }

    public String inputTitle() {
        sc.nextLine();
        System.out.print("곡명 입력 : ");
        String inputTitle = sc.nextLine();

        return inputTitle;
    }

    public String inputSinger() {
        sc.nextLine();
        System.out.print("가수명 입력 : ");
        String inputSinger = sc.nextLine();

        return inputSinger;
    }

    public Music inputMusic() {
        sc.nextLine();
        System.out.print("곡명 입력 : ");
        String inputTitle = sc.nextLine();
        System.out.print("가수명 입력 : ");
        String inputSinger = sc.nextLine();


        Music inputMusic = new Music(inputTitle, inputSinger);

        return inputMusic;
    }

    private String sort = "================== 정렬 메뉴 ===================\n"
            + "1. 가수명 오름차순\n"
            + "2. 가수명 내림차순\n"
            + "3. 곡명 오름차순\n"
            + "4. 곡명 내림차순\n"
            + "5. 메인메뉴 돌아가기\n"
            + "==============================================\n"
            + ">> 메뉴선택 : ";

    public void sortMenu() {
        System.out.print(sort);
        String choice = sc.next();
        switch(choice) {
            case "1" :
                manager.orderBy(new MusicSingerComp());
                break;
            case "2" :
                manager.orderBy(Collections.reverseOrder(new MusicSingerComp()));
                break;
            case "3" :
                manager.orderBy(new MusicTitleComp());
                break;
            case "4" :
                manager.orderBy(Collections.reverseOrder(new MusicTitleComp()));
                break;
            case "5" :
                return;
            default :
                System.out.println("잘못 입력하셨습니다. 메인메뉴로 돌아갑니다.");
                return;
        }
    }

}
