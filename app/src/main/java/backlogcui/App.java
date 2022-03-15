/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package backlogcui;

import backlogcui.process.ProcessExecutor;
import backlogcui.process.ProcessShowAllCommands;

public class App {
    public static void main(String[] args) {
        new App().launchBackLogCUI();
    }

    /**
     * コマンド入力の受付を開始。以降の状態の管理はProcessExecutorの実装クラスで行う
     * アプリケーション起動時の初回のみ実行する
     */
    private void launchBackLogCUI() {
        ProcessExecutor process = new ProcessShowAllCommands();
        process.execute();
    }
}