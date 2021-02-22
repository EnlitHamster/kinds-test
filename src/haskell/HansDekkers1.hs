module HansDekkers1 where

import Control.Monad
import Data.Array
import Data.Bits
import Data.List
import Data.Set
import Data.Text
import Debug.Trace
import System.Environment
import System.IO
import System.IO.Unsafe

hans :: Int -> Int -> IO ()
hans a b  | a > b = mapM_ putStrLn $ Data.List.map (hans' b a) [0..1000]
          | otherwise = mapM_ putStrLn $ Data.List.map (hans' a b) [0..1000]

hans' :: Int -> Int -> Int -> String
hans' a b n | n `mod` a == 0 && n `mod` b == 0 = "HANS DEKKERS"
            | n `mod` b == 0 = "DEKKERS"
            | n `mod` a == 0 = "HANS"
            | otherwise = show n

lstrip = Data.Text.unpack . Data.Text.stripStart . Data.Text.pack
rstrip = Data.Text.unpack . Data.Text.stripEnd . Data.Text.pack

main :: IO ()
main = do
  temp1 <- getLine
  let a = read $ lstrip $ rstrip temp1 :: Int
  temp2 <- getLine
  let b = read $ lstrip $ rstrip temp2 :: Int
  hans a b
