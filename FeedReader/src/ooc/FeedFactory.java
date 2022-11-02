/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooc;

import java.io.BufferedReader;
import java.io.IOException;

 /**
     * This method use a buffered reader passed in when called, and create
     * the instance of the feed class Remember that the Feed class must
     * implement the FeedInterface interface
     *
     * @param in of the type bufferedReader
     * @return an instance of your feed class
     * @throws IOException
     */
public class FeedFactory implements FeedFactoryInterface {
    @Override
    public FeedInterface createFeed(BufferedReader in) throws IOException{
          String title = in.readLine();
        String content = "";
        
        FeedInterface feed = new Feed();
        
        while(title != null){
            //System.out.println(title);
            content = in.readLine();
            //System.out.println(content);
            
            FeedItem item = new FeedItem(title, content);
            feed.addItem(item);
            
            title = in.readLine();
        } 
        return feed;
    }
}
