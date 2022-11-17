package com.sist.exception2;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

/*
 * <td><a href="#" class="cover"  onclick="fnViewAlbumLayer(82614128); return false;" ontouchend="fnViewAlbumLayer(82614128); return false;" ><span class="mask"></span><img onerror="this.src='//image.genie.co.kr/imageg/web/common/blank_68.gif';" src="//image.genie.co.kr/Y/IMAGE/IMG_ALBUM/082/614/128/82614128_1648619377015_1_140x140.JPG/dims/resize/Q_80,0" alt="사건의 지평선" /></a></td>
    <td class="link"><a href="#" class="btn-basic btn-info" onclick="fnViewSongInfo(96424586); return false;" ontouchend="fnViewSongInfo(96424586); return false;" >곡 제목 정보 페이지</a></td>
      <td class="info">
           <a href="#" class="title ellipsis" title="사건의 지평선" onclick="fnPlaySong('96424586;','1'); return false;" ontouchend="fnPlaySong('96424586;','1'); return false;">
사건의 지평선</a>
            <a href="#" class="artist ellipsis"onclick="fnViewArtist(42307533); return false;" ontouchend="fnViewArtist(42307533); return false;" >윤하 (YOUNHA)</a>           <div class="toggle-button-box" id="hide-button">
               <button type="button" class="btn artist-etc"onclick="fnRelationArtistList('96424586'); artist_etc_layer._show(this);return false;" ontouchend="fnRelationArtistList('96424586'); artist_etc_layer._show(this);return false;" >외</button>
               <dl class="list" id="RelationArtist_96424586">
               </dl>
           </div>
            <i class="bar">|</i>
            <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer(82614128); return false;" ontouchend="fnViewAlbumLayer(82614128); return false;" >YOUNHA 6th Album Repackage 'END THEORY : Final Edition'</a>
        </td>
 */

/*
 * 지니뮤직 url 카피
 * https://www.genie.co.kr/chart/top200 : Top200
 * https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0100  가요
 * https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0200	POP
 * https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0300	OST
 * https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0107	트롯
 * https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0500	JAZZ
 * https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0600	CLASSIC
 */
public class MusicSystem {
	private String[] url = {
			"", // type에서 0번을 안 고르면 0번 자체를 버린다
			"https://www.genie.co.kr/chart/top200",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0100",
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0200",	
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0300",	
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0107",	
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0500",	
			"https://www.genie.co.kr/chart/genre?ditc=D&ymd=20221116&genrecode=M0600"	
	};
	public MusicVO[] musicDate(int type) throws Exception // 예외처리를 하고 가야한다. 
	{
		MusicVO[] music = new MusicVO[50]; // 한 번에 50곡을 가져와라 # 한 페이지에 50곡씩 있음
		// URL 연결
		Document doc = Jsoup.connect(url[type-1]).get(); // Document 여러개 있는데 jsoup.nodes를 선택해서 가져오기
		Elements title = doc.select("table.list-wrap td.info a.title");//org.jsoup.select
		Elements singer = doc.select("table.list-wrap td.info a.artist");
		Elements album = doc.select("table.list-wrap td.info a.albumtitle");
		int k=0;
		for(int i=0;i<50;i++)
		{
			music[k]=new MusicVO();
			music[k].setTitle(title.get(i).text());
			music[k].setSinger(singer.get(i).text());
			music[k].setAlbum(album.get(i).text());
			k++;
		}
		return music;
	}
}
